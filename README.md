App Overview
This app helps you track the temperatures for each day of the week, calculate the average temperature for the week, and view detailed daily temperatures.

How to Use the App
Splash Screen:

When you open the app, you will see a splash screen with two buttons: START and BACK.
Click START to go to the main screen.
Click BACK to exit the app.
Main Screen:

On the main screen, you will see several elements:
An input field for entering the temperature data.
A text view displaying the average temperature.
Buttons labeled NEXT, CLEAR, and EXIT.
A prompt asking you to enter temperatures.
Entering Temperatures:

The app will prompt you to enter the temperature for each day in sequence, starting from Monday.
Type the temperature into the input field and press the "done" button on your keyboard.
The app will then prompt you for the temperature of the next day.
Clear Data:

If you want to start over, click the CLEAR button. This will reset all entered data and clear the input field and average temperature display.
View Average Temperature:

After entering temperatures for all 7 days, the app will automatically calculate and display the average temperature for the week in the text view labeled Average temperature.
View Detailed Information:

Click the NEXT button to navigate to a detailed view screen where you can see the individual temperatures and conditions for each day.
Exit the App:

Click the EXIT button to close the app.
Error Handling
If you enter invalid data (e.g., non-numeric values or incorrect number of entries), the app will display an error message prompting you to correct the input.
The app ensures that you can only proceed after entering valid temperature data for each day.
Internal Workings (For Developers)
The app stores temperatures in an array of doubles and uses another array for weather conditions.
The average temperature is calculated by summing the temperatures and dividing by 7.
The app handles user input with an OnEditorActionListener to process and validate data.
By following these steps, you can efficiently use the app to manage and view weekly weather conditions!
