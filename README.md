
# Network Connection Status with Jetpack Compose

This Android project demonstrates how to track and display the network connection status using Jetpack Compose. It includes a custom `ConnectionManager` class that uses `StateFlow` to observe network connectivity changes and updates the UI accordingly.

## Features

- **Live Network Monitoring:** The app listens for network connectivity changes in real-time.
- **Jetpack Compose UI:** The UI dynamically updates to reflect the online/offline status.
- **Animated UI Transitions:** Smooth color and icon transitions are used to indicate the change in network status.

## How It Works

1. **ConnectionManager:** This class uses `ConnectivityManager` and `callbackFlow` to monitor network changes and emits the network status as a `StateFlow<Boolean>`.

2. **MainActivity:** Subscribes to the network status using `collectAsState()` and updates the `HomeScreen` composable based on the current connection status.

3. **HomeScreen Composable:** Displays a card with a message and an icon, both of which animate smoothly when the network status changes.

## Prerequisites

- **Android Studio**: Arctic Fox or later
- **Kotlin**: 1.5 or later
- **Jetpack Compose**: 1.0.0 or later

## How to Run

1. Clone this repository to your local machine.
   ```sh
   git clone https://github.com/your-username/network-connection-status.git
   ```
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Demo

You can watch the demo video below to see the app in action:

[Network Connection Ui Demo](https://github.com/user-attachments/assets/1c5a0ac5-4f5c-4361-88c2-02de20e05bdd)
