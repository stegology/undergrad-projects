# Stephanie LaBruna
# STAT200
# 
#

# Load package
library(ggplot2)

# Parameters for the normal distribution
mean_weight <- 31.9 # Mean weight
sd_weight <- 3.6    # Standard deviation
weight <- 30.       # Selected weight

# Calcuate z score
z_score <- (weight - mean_weight) / sd_weight
print(paste("The Z-score for", weight, "pounds is:", round(z_score, 4)))

#Calculate the percentile for selected weight
percentile <- pnorm(weight, mean = mean_weight, sd = sd_weight)
print(paste("The percentile for", weight, "pounds is:", round(percentile, 4))) # check value

# Create values for the x-axis
x_values <- seq(20, 45, by = 0.1)

# Calculate the corresponding density values for the normal distribution
y_values <- dnorm(x_values, mean = mean_weight, sd = sd_weight)

# Create a data frame for ggplot
plot_data <- data.frame(x = x_values, y = y_values)

# Create the plot
ggplot(plot_data, aes(x, y)) + 
  geom_line(color = "blue") + # Plot the normal distribution curve
  geom_area(data = subset(plot_data, x <= weight), aes(x = x, y = y), fill = "lightblue") +    #shade the area to the left
  geom_vline(xintercept = weight, color = "red", linetype = "dashed") +    # add a vertical line at 30lbs
  labs(title = "Normal Distribution of 3-Year-Old Male Weights",
       x = "Weight (lbs)",
       y = "Density",
       subtitle = paste("Shaded area represents percentile for", weight, "lbs")) +
  annotate("text", x = weight + 1, y = 0.04, 
           label = paste("Percentile: ", round(percentile, 4)), 
           color = "black", 
           size = 4, 
           hjust = 0) + # Displays percentile
  annotate("text", x = weight + 1, y = 0.03, 
           label = paste("Z-Score: ", round(z_score, 4)), 
           color = "black", 
           size = 4, 
           hjust = 0) + # Display z-score  
  theme_minimal()

