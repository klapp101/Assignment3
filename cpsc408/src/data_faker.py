import sys
import csv
import os.path
from faker import Faker
#Setting number of rows to 0
numRows = 0
#Asking for name of file
filename = raw_input("Please enter the name of the file\n")
#opening file to write to
with open(filename,'w') as csvfile:
    #implementation of faker
    fake = Faker()
    #Asking user for number of rows
    numRows = int(raw_input("How many rows would you like to create?\n"))
    #Setting tuples
    fNames = ['FullName', 'PhoneNumber', 'Email', 'Occupation', 'CreditCardNumber', 'Latitude', 'Longitude']
    writer = csv.DictWriter(csvfile,fieldnames = fNames)

    writer.writeheader()
    #Creation of fake data based off of user input of # of rows
    while numRows > 0:
        writer.writerow(
        {
            'FullName' : fake.name(),
            'PhoneNumber' : fake.phone_number(),
            'Email' : fake.email(),
            'Occupation' : fake.job(),
            'CreditCardNumber' : fake.credit_card_number(),
            'Latitude' : fake.latitude(),
            'Longitude' : fake.longitude()
        })
        #Decrement 1 each time until numRows isn't > 0
        numRows -= 1
