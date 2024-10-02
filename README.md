# Stock Lookup Application


https://github.com/user-attachments/assets/8f38aec4-c1ca-46bd-9b59-9c5f00d8158f



<img src="https://github.com/user-attachments/assets/ea34cf43-7d3e-4eec-a4da-4a3f66fb32dc" width="200" height="400">
<img src="https://github.com/user-attachments/assets/c9354081-6bda-4bc5-903f-9ceb06b38ce8" width="200" height="400">


## Overview
The Stock Lookup Application allows users to search for stock symbols and view their details such as last price, price change, and percent change. This application uses a RecyclerView to display stock information fetched from a stock market API.

## Features
- Search stocks by symbol or name.
- Display details of stocks including last price, price change, and percent change.
- Dynamic filtering of stocks as the user types in the search field.

## Requirements
- Android Studio (Arctic Fox or higher)
- Android SDK
- Java Development Kit (JDK) 8 or higher
- Internet access for fetching stock data

## Setup Instructions

### 1. Clone the Repository
Clone the project repository to your local machine using the following command:

```bash
git clone https://github.com/yourusername/stock_lookup.git

2. Open the Project
Open Android Studio.
Select Open an existing Android Studio project.
Navigate to the folder where you cloned the repository and select it.
3. Sync Gradle
After opening the project, Android Studio may prompt you to sync Gradle. Click on the Sync Now button that appears at the top.

4. Update Dependencies
Ensure all dependencies are up-to-date. You can do this by checking the build.gradle files in both the project-level and app-level directories.

5. Configure API Keys
In the StockRepository class, make sure to replace the placeholder API key with your actual API key. Update the following line in your code:

kotlin
Copy code
val response = StockRepository().getMostActiveStocks(
    "YOUR_API_KEY", // Replace with your actual API key
    "yahoo-finance15.p.rapidapi.com"
)
6. Build the Project
Click on Build in the top menu.
Select Make Project to build the project. Ensure there are no errors in the build process.
7. Run the Application
Connect an Android device to your computer or use an Android Virtual Device (AVD) emulator.
Click on the Run button (green triangle) in the toolbar or press Shift + F10.
Select your device or emulator, and the application will launch.
Usage Instructions
Upon launching the application, you will see a search bar at the top.
Start typing the stock symbol or name in the search bar to filter the stock list dynamically.
The app will display stock details below the search bar.
Code Structure
MainActivity: The main entry point of the application. It initializes the ViewModel and sets up the RecyclerView.
StockViewModel: Manages UI-related data and communicates with the StockRepository to fetch stock data.
StockAdapter: Binds stock data to the RecyclerView for display.
item_stock.xml: Layout for individual stock items in the RecyclerView.
activity_main.xml: Layout for the main activity, including the search bar and RecyclerView.
Troubleshooting
Gradle Sync Issues: If you encounter Gradle sync issues, ensure you have the correct versions of Android Studio and SDK installed.
API Key Issues: If data is not fetching, check your API key and ensure you have internet connectivity.
Emulator Performance: For a smoother experience, enable hardware acceleration for your emulator.
License
This project is licensed under the MIT License. See the LICENSE file for more details.

Acknowledgments
Yahoo Finance API for stock market data.
Android Developers for comprehensive Android documentation and resources.


### Additional Tips:
- Update the `API Key` section with precise instructions on how to obtain a key if needed.
- Add images or screenshots of the app to enhance the README.
- Include any additional setup instructions specific to your environment or additional dependencies that may be required.

Feel free to adjust any section to better fit your project specifics!



