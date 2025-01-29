# Write a function that counts down from a user entered integer on separate lines. You must use a loop and you must validate input.

def function():

  numEntered = input("Enter a number: ") # INPUT ASKS FOR USER FROM

  while not numEntered.isdigit(): # Checks if you entered a number or not
      print("The input must be a number.")
      print()
      numEntered = input("Enter a number: ")

  try: # Changes the entered string to an interger
    numEntered = int(numEntered)
  except ValueError as err:
    pass 

  print() # BLANK LINE!!!!

  while numEntered >= 0: # while the number is not 0 keeps subbing one
      print(numEntered)
      numEntered -= 1

  print() # ANOTHER BALNK LINE!!!!

function()