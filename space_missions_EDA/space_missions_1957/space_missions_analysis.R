# Load required libraries 
library(tidyverse)
library(lubridate)

# Install gridExtra package
if (!require(gridExtra)) {
  install.packages("gridExtra")
}
library(gridExtra)

# Read the data
space_missions <- read.csv("Space_Corrected.csv.xls", stringsAsFactors = FALSE)

# Examine the data
str(space_missions)
head(space_missions)
summary(space_missions)

# Check for missing values
colSums(is.na(space_missions))

# Get a glimpse of the data
glimpse(space_missions)

# Inspect the first few entries of the Datum column
head(space_missions$Datum)

# Convert date column to Date type using strptime
space_missions$Date <- strptime(space_missions$Datum, format="%a %b %d, %Y %H:%M")

# Check the structure again to ensure the Date conversion
str(space_missions)

# Handle missing values by removing rows with any missing values
space_missions <- space_missions %>%
  drop_na()

# Create new variable for the year of the missions
space_missions <- space_missions %>%
  mutate(Year = year(Date), Decade = floor(Year / 10) * 10)

# Extract country form location
space_missions <- space_missions %>%
  mutate(Country = word(Location, -1, sep = ", "))

# Basic statistical analysis
summary(space_missions$Year)
summary(space_missions$Rocket)

# Data Visualization
# Number of missions per year
plot1 <- ggplot(space_missions, aes(x = Year)) + 
  geom_bar() + 
  labs(title = "Number of Space Missions per Year", x = "Year", y = "Number of Missions")

# Number of missions per country 
plot2 <- ggplot(space_missions, aes(x = Country)) +
  geom_bar() +
  labs(title = "Number of Space Missions per Country", x = "Country", y = "Number of Missions") +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))

# Success rate per country
plot3 <- ggplot(space_missions, aes(x = Country, fill = Status.Mission)) +
  geom_bar(position = "fill") +
  labs(title = "Success Rate of Space Missions per Country", x = "Country", y = "Proportion") +
  theme(axis.text.x = element_text(angle = 45, hjust = 1))

# Trend analysis: Number of missions over time
missions_per_year <- space_missions %>%
  group_by(Year) %>%
  summarise(total_missions = n())

plot4 <-ggplot(missions_per_year, aes(x = Year, y = total_missions)) +
  geom_line() +
  labs(title = "Trend of Space Missions Over Time", x = "Year", y = "Total Missions")

# Display the plots together
grid.arrange(plot1, plot2, plot3, plot4, ncol = 2)