# Import pandas
import pandas as pd

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pd.DataFrame(data)

# Print the DataFrame
print(dataframe)

# Write the DataFrame to a CSV file 

dataframe.to_csv("./activities/sample.csv", index = False) # it will not write index to the file

#For Reading the file
input_data = pd.read_csv("./activities/sample.csv") 
#print only user names
print(input_data["Usernames"])
#print only user name and password from second row
print(input_data["Usernames"][1], input_data["Passwords"][1],)
	
#Sort the Usernames column in ascending order
print(dataframe.sort_values('Usernames'))
 
#Sort the Passwords column in descending order
print(dataframe.sort_values('Passwords', ascending=False))