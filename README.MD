Created from https://terrakok.github.io/Compose-Multiplatform-Wizard/
Please Help yourself if find useful

# Compose Multiplatform Application

## Before running!

- check your system with [KDoctor](https://github.com/Kotlin/kdoctor)
- install JDK 17 or higher on your machine
- add `local.properties` file to the project root and set a path to Android SDK there

### Android

To run the application on android device/emulator:

- open project in Android Studio and run imported android run configuration

To build the application bundle:

- run `./gradlew :composeApp:assembleDebug`
- find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`
  Run android UI tests on the connected device: `./gradlew :composeApp:connectedDebugAndroidTest`

### Desktop

Run the desktop application: `./gradlew :composeApp:run`
Run desktop UI tests: `./gradlew :composeApp:jvmTest`

### iOS

To run the application on iPhone device/simulator:

- Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
- Or
  use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile)
  for Android Studio
  Run iOS simulator UI tests: `./gradlew :composeApp:iosSimulatorArm64Test`

### Wasm Browser (Alpha)

Run the browser application: `./gradlew :composeApp:wasmJsBrowserDevelopmentRun --continue`
Run browser UI tests: `./gradlew :composeApp:wasmJsBrowserTest`


# Work under progress


Components of compose compared with xml ui components
### 🧱 Jetpack Compose vs Android XML UI Components

| Jetpack Compose Component            | Android XML Equivalent             | Notes                                                                 |
|-------------------------------------|------------------------------------|-----------------------------------------------------------------------|
| `Text()`                            | `<TextView>`                       | Used to display text                                                  |
| `Button()`                          | `<Button>`                         | Standard button with click action                                    |
| `OutlinedButton()`                  | `<Button style="?attr/borderlessButtonStyle">` | Border only, no fill                                             |
| `IconButton()`                      | `<ImageButton>`                    | Button with an icon only                                              |
| `Image()`                           | `<ImageView>`                      | Displays an image                                                     |
| `TextField()`                       | `<EditText>`                       | Basic editable text input field                                       |
| `OutlinedTextField()`               | `<EditText style="Outlined">`      | Text input with an outlined border                                   |
| `LazyColumn()`                      | `<RecyclerView>` (Vertical)        | Efficient list rendering, similar to RecyclerView                     |
| `LazyRow()`                         | `<RecyclerView>` (Horizontal)      | Horizontal list layout                                                |
| `Column()`                          | `<LinearLayout android:orientation="vertical" />` | Vertical layout container                                 |
| `Row()`                             | `<LinearLayout android:orientation="horizontal" />` | Horizontal layout container                                |
| `Box()`                             | `<FrameLayout>`                    | Overlapping layout elements                                           |
| `Spacer()`                          | `android:layout_margin / layout_padding` | Adds spacing between elements                                 |
| `Card()`                            | `<CardView>`                       | Material-styled card                                                  |
| `Surface()`                         | `<View>` with custom background    | Used to style surface color, elevation                               |
| `TopAppBar()`                       | `<Toolbar>`                        | Top bar with title, icons, actions                                   |
| `BottomAppBar()`                    | `<BottomAppBar>`                   | Bottom bar for navigation or actions                                 |
| `Scaffold()`                        | `<CoordinatorLayout> + <AppBarLayout> + <FAB>` | Combines layout structure elements                       |
| `FloatingActionButton()`            | `<FloatingActionButton>`           | Circular button used for primary action                              |
| `AlertDialog()`                     | `AlertDialog.Builder`              | Dialog with title, message, buttons                                  |
| `DropdownMenu()`                    | `<Spinner>` or `PopupMenu`         | Dropdown list                                                         |
| `Checkbox()`                        | `<CheckBox>`                       | Boolean toggle                                                        |
| `Switch()`                          | `<Switch>`                         | On/Off toggle switch                                                  |
| `RadioButton()`                     | `<RadioButton>`                    | Used within a `RadioGroup` in XML                                    |
| `Slider()`                          | `<SeekBar>`                        | Range slider for input                                                |
| `ProgressIndicator()`               | `<ProgressBar>`                    | Circular or linear loading indicator                                 |
| `Navigation()`                      | `NavController` + `<fragment>`     | Navigation via Composables (Jetpack Navigation Compose)              |
| `remember`, `mutableStateOf`       | ViewModel + LiveData / StateFlow   | For state management                                                  |
| `LaunchedEffect`                    | `onStart()` / `onResume()`         | Triggers a side-effect on entering the composition                    |
| `rememberCoroutineScope()`          | CoroutineScope in Activity/Fragment | Used to launch coroutines in composables                            |


