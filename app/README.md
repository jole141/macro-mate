# Development

Install expo command-line tool

```bash
npm install --global expo-cli
```

To install all the packages run

```bash
yarn install
```

We chose the [Expo framework](https://docs.expo.dev/) for development.
The fastest way to get it up and running is to use the Expo Go app on your iOS or Android device. Expo Go allows you to open up apps that are being served through Expo CLI.

- [Android Play Store](https://play.google.com/store/apps/details?id=host.exp.exponent) - Android Lollipop (5) and greater.
- [iOS](https://itunes.com/apps/exponent) - iOS 11 and greater.

### Running on device

Start the developer client with

```bash
expo start
```

When you run expo start (or yarn start), Expo CLI starts Metro Bundler, which is an HTTP server that compiles the JavaScript code of our app using Babel and serves it to the Expo app.

Scan the QR code with your mobile phone, you will need to be connected to the same internet network.

You are now ready to start developing the app. Any additional information can be found in the [Expo documentation](https://docs.expo.dev/), including how to use emulators and simulators and how to build standalone apps.