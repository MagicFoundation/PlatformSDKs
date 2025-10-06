Ghitub Repository
-----------------

Because ghitub does not support file > 100MB, 
some files are stored compressed. So every time 
you update this repository (`git pull`), you must 
run `Unpack.bat`.

In the same way, before every commit you must 
run `Pack.bat` to compress those big files. 


ANDROID
-------
 
### Install OpenJDK Binaries 11, 17 and 21  

Download **ZIP package** from [Adoptium](https://adoptium.net/)  
  - **Operating System**: Windows  
  - **Architecture**: x64  
  - **Package Type**: jdk  
  - **Versions**: 11, 17 and 21  

Then **unzip** them to:

```
c:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\
c:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\
c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\
```

Next, **add/update** in **system environment variables** (using the GUI—**do not** use `setx` as it might truncate the PATH to 1024 chars):

```
c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\bin\
```

Finally, **add/update** system environment variable `JAVA_HOME`:

```
JAVA_HOME = c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\
```
   
### List installed and available packages  

```
"c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\sdkmanager.bat" --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\Android\ --list
```
   
### Reinstall all the Android SDK/NDK 

```
"c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\sdkmanager.bat"^
 "build-tools;29.0.3"^
 "build-tools;30.0.3"^
 "build-tools;31.0.0"^
 "build-tools;32.0.0"^
 "build-tools;33.0.3"^
 "build-tools;34.0.0"^
 "build-tools;35.0.0"^
 "cmdline-tools;9.0"^
 "cmdline-tools;10.0"^
 "cmdline-tools;11.0"^
 "cmdline-tools;12.0"^
 "cmdline-tools;13.0"^
 "cmdline-tools;16.0"^
 "extras;android;m2repository"^
 "extras;google;google_play_services"^
 "extras;google;m2repository"^
 "extras;google;usb_driver"^
 "ndk;27.1.12297006"^
 "platform-tools"^
 "platforms;android-23"^
 "platforms;android-24"^
 "platforms;android-25"^
 "platforms;android-26"^
 "platforms;android-27"^
 "platforms;android-28"^
 "platforms;android-29"^
 "platforms;android-30"^
 "platforms;android-31"^
 "platforms;android-32"^
 "platforms;android-33"^
 "platforms;android-34"^
 "platforms;android-35"^
 "sources;android-23"^
 "sources;android-24"^
 "sources;android-25"^
 "sources;android-26"^
 "sources;android-27"^
 "sources;android-28"^
 "sources;android-29"^
 "sources;android-30"^
 "sources;android-31"^
 "sources;android-32"^
 "sources;android-33"^
 "sources;android-34"^
 "sources;android-35"^
 --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\Android\
```

### Uninstall a package 

```
"c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\sdkmanager.bat" --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\Android\ --uninstall "ndk;21.4.7075529"
```
   
### Create an emulator (doesn't work anymore on Intel)

```
"c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\avdmanager.bat" create avd -n android13 -k "system-images;android-33;google_apis;arm64-v8a"
```

However, this may fail due to known issues:  
  - [StackOverflow discussion](https://stackoverflow.com/questions/74760027/exception-during-avdmanager-initialization)  
  - [GitHub issue](https://github.com/ReactiveCircus/android-emulator-runner/issues/235)
    
 
IOS
---

### Set Up macOS in VMware

  - Install the lastest macOS on a VMWare instance. 
  - Follow the instructions: {MagicFoundation}\Softwares\MacOS\README.md

### Enable Remote Login on macOS

  - On your macOS, go to System Settings (or System Preferences on older 
    versions) → Sharing → Remote Login. Enable it and make sure your user 
    is allowed to connect.

### Set Up Your SSH Folder and Authorized Keys

  - **Generate an SSH Key on Windows:**
      - Open a command prompt or PowerShell on Windows.
      - Run `ssh-keygen` to create a public/private key pair. By default, the 
        keys are stored in C:\Users\zeus\.ssh\

  - **Copy Your Public Key to macOS:**
      - Open the file `C:\Users\zeus\.ssh\id_xxx.pub` (replace `id_xxx.pub` with 
        your actual public key filename) in a text editor and copy its content.
      - On your macOS, open Terminal and run:
        ```
        mkdir -p ~/.ssh
        chmod 700 ~/.ssh
        touch ~/.ssh/authorized_keys
        chmod 600 ~/.ssh/authorized_keys
        open -e ~/.ssh/authorized_keys
        ```
      - Paste the copied public key into the opened `authorized_keys` file, then 
        save and close it.

  - **Establish the Connection:**
      - On Windows, open a command prompt or PowerShell and run:
        ```
        ssh {username}@{macosip}
        ```
        Replace `{username}` with your macOS username and `{macosip}` with your macOS IP address.
      - The first time you connect, you'll be prompted to confirm the host's 
        fingerprint; type `yes` to add it to your known_hosts.
  
### Install and Launch Xcode

  - In the macOS, from the app store, install XCode. You will need to 
    enter your your apple ID email and password. 
  - Launch XCode and select macOS and iOS plateform

### Install PAServer

  - Install in Macos: c:\Program Files (x86)\Embarcadero\Studio\37.0\PAServer\PAServer37.0.pkg
  - Go in Finder > Applications > right click on PAServer 37 icon and select Open. if you receive
    the error message saying "PAServer 37 damaged and cannot be opened" then click again on the 
    "Open" button (Temporarily bypass security features by right-clicking the app and selecting Open twice)
    https://iboysoft.com/news/app-is-damaged-and-cannot-be-opened.html
  - Go in Finder > Applications > drag and drop PAServer-37 icon to the desktop to create a short link
  - Launch PAServer-37

### Configure Keychain Access

  - Finder > Applications > Utilities > Keychain Access (select Open Keychain Access in popup dialog)
  - Select "System" keychain in the left panel
  - Menu > Keychain Access > Certificate Assistant > Request a Certificate From a Certificate Authority:
      - User Email Address: {Your apple ID Email}
      - Common name: {CompanyName}.developer.apple.com
      - CA Email Address: {leaveEmpty} 
      - Save to Disk: {Checked}
      - Save the certificate somewhere on the disk
    
### Obtain & Install Apple Development Certificate
    
  - Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
  - select Apple Development
  - select the certificate previously saved
  - download the new certificate
  - IMPORTANT: Select "System" keychain in the left panel of the Keychain Access utilities
  - Launch the Certificate by double-clicking it. It automatically loads in the Keychain Access application.
  - If asked, in the "add certificates" popup dialog select "System" Keychain
  - If you get "certificate is not trusted" red warning in keychain when looking the new installed certificate then install
    also this certificate: https://www.apple.com/certificateauthority/AppleWWDRCAG3.cer

### Obtain & Install Apple Distribution Certificate

  - Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
  - select Apple Distribution
  - select the certificate previously saved
  - download the new certificate
  - IMPORTANT: Select "System" keychain in the left panel of the Keychain Access utilities
  - Launch the Certificate by double-clicking it. It automatically loads in the Keychain Access application.
  - If asked, in the "add certificates" popup dialog select "System" Keychain

### Obtain & Install Mac App Distribution Certificate

  - Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
  - select Mac App Distribution
  - select the certificate previously saved
  - download the new certificate
  - IMPORTANT: Select "System" keychain in the left panel of the Keychain Access utilities
  - Launch the Certificate by double-clicking it. It automatically loads in the Keychain Access application.
  - If asked, in the "add certificates" popup dialog select "System" Keychain
  - Exit keychain access 

### Obtain & Install Mac Installer Distribution Certificate

  - Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
  - select Mac Installer Distribution
  - select the certificate previously saved
  - download the new certificate
  - IMPORTANT: Select "System" keychain in the left panel of the Keychain Access utilities
  - Launch the Certificate by double-clicking it. It automatically loads in the Keychain Access application.
  - If asked, in the "add certificates" popup dialog select "System" Keychain
  - Exit keychain access 

### Add an iOS Wildcard App ID

  - Go to https://developer.apple.com/account/resources/identifiers/list and click (+) to add a new identifier
  - Select App IDs
  - Select App
      - Description: XC Wildcard  
      - Bundle ID: .* (wildcard)

### Add an iOS Explicit App ID

  - Go to https://developer.apple.com/account/resources/identifiers/list and click (+) to add a new identifier
  - Select App IDs
  - Select App
      - Description: {AppName}  
      - Bundle ID (explicit): {Domain in lowercase}.{AppName in lowercase}.app  
      - Associated Domains: YES  
      - Sign In with Apple: YES (Enable as a primary App ID)  
      - Push Notifications: YES  

### Create iOS App Development Provisioning Profile

  - Go to https://developer.apple.com/account/resources/profiles/list and click (+) to add a new profile
  - Select iOS App Development
  - Select XC Wildcard
  - Select All Certificate
  - Select All devices and include mac devices
  - Name it XC Wildcard
  - Download your new provisioning profile
  - copy the new provisioning profile to /Users/zeus/Library/Developer/Xcode/UserData/Provisioning Profiles/ 
    (in xcode < 16 in /Users/zeus/Library/MobileDevice/Provisioning Profiles/)
  - delete the unwanted provisioning profiles
  - In case Delphi doesn't detect a profile, restarting macOS usually resolves the issue.
      
### Create App Store Connect Provisioning Profile

  - Go to https://developer.apple.com/account/resources/profiles/list and click (+) to add a new profile
  - Select App Store Connect
  - Select your App ID
  - Select the "Distribution" Certificate
  - Name it {Domain in lowercase}.{AppName in lowercase}.app 
      - Note: It doesn't matter if several profiles have the same name—this is already the case with certificates
  - Download your new provisioning profile
  - copy the new provisioning profile to /Users/zeus/Library/Developer/Xcode/UserData/Provisioning Profiles/ 
    (in xcode < 16 in /Users/zeus/Library/MobileDevice/Provisioning Profiles/)
  - delete the unwanted provisioning profiles
  - In case Delphi doesn't detect a profile, restarting macOS usually resolves the issue.

### Manage Provisioning Profiles & Deploy

  - Open Xcode on the Mac and go to the Devices (Window > Devices).
  - Right-click the device (ex the iphone 7) and select Show Provisioning Profiles…
  - Delete all unwanted Provisioning Profile from your mobile device
  - Install an app from delphi in the mobile device. This will also install the provisioning 
    profile in the mobile device.


Configure Delphi to use the framework SDKs
------------------------------------------

* Tools > Options > IDE > Environment Variables > User System Overrides
    - New
    - Variable Name: BDSPLATFORMSDKSDIR
    - Variable Value: c:\Dev\MagicFoundation\PlatformSDKs
      
* Tools > Options > Deployment > Connection Profile Manager
    - Add
    - Profile name: VMWare
    - Platform: macOS 64-bit
    - Remote Machine (IP address or Machine name): 192.168.80.129
    - Port number: 64211
    - password:
      
* Save c:\Dev\MagicFoundation\PlatformSDKs folder somewhere (in case)

* Delete iPhoneOSxxx.sdk, iPhoneSimulatorxxx.sdk and MacOSXxxx.sdk inside the c:\Dev\MagicFoundation\PlatformSDKs

* Tools > Options > Deployment > SDK Manager
    - Add
    - macOS 64 bit   
    - if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
      https://quality.embarcadero.com/browse/RSP-41260 
      
* Tools > Options > Deployment > SDK Manager
    - Add
    - macOS ARM 64 bit      
    - if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
      https://quality.embarcadero.com/browse/RSP-41260 
      
* Tools > Options > Deployment > SDK Manager
    - Add
    - iOS Simulator ARM 64 bit      
    - if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
      https://quality.embarcadero.com/browse/RSP-41260 
  
* Tools > Options > Deployment > SDK Manager
    - Add
    - iOS device 64 bit    
    - if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
      https://quality.embarcadero.com/browse/RSP-41260 
      
* Tools > Options > Deployment > SDK Manager
    - Add
    - Android 32 bit   

      !!WARNING!! Take a look of this post before to change anything below:
      https://stackoverflow.com/questions/60084704/aab-format-return-an-apk-without-armeabi-v7a-library-under-32-bit-devices  
      
      Under Tools, Options, Deployment, SDK Manager you will need to add the following frameworks:
                  
      ```
      c:\Dev\MagicFoundation\PlatformSDKs\Android
      c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\avdmanager.bat
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platform-tools\adb.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platforms\android-35

      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\bin\ld.lld.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\bin\llvm-strip.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\lib\clang\18\lib\linux\libclang_rt.builtins-arm-android.a
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\sysroot\usr\lib\arm-linux-androideabi\23;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\sysroot\usr\lib\arm-linux-androideabi

      c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\bin\keytool.exe
      c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\bin\jarsigner.exe
      ```
                               
* Tools > Options > Deployment > SDK Manager
    - Add
    - android 64 bit  

      !!WARNING!! Take a look of this post before to change anything below:
      https://stackoverflow.com/questions/60084704/aab-format-return-an-apk-without-armeabi-v7a-library-under-32-bit-devices  
      
      Under Tools, Options, Deployment, SDK Manager you will need to add the following frameworks:      

      ```
      c:\Dev\MagicFoundation\PlatformSDKs\Android
      c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\avdmanager.bat
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platform-tools\adb.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platforms\android-35

      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\bin\ld.lld.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\bin\llvm-strip.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\lib\clang\18\lib\linux\libclang_rt.builtins-aarch64-android.a
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\sysroot\usr\lib\aarch64-linux-android\23;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\27.1.12297006\toolchains\llvm\prebuilt\windows-x86_64\sysroot\usr\lib\aarch64-linux-android

      c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\bin\keytool.exe
      c:\Program Files\Eclipse Adoptium\jdk-21.0.8.9-hotspot\bin\jarsigner.exe
      ```

* Under Tools, Options, SDK Manager you will need to add the following frameworks for ios64 and ios64 Simulator:
      
  ```
  Path on remote machine                                                                           |  File mask               |  Path Type     |  Include subdirectories
  $(SDKROOT)/usr/lib/swift                                                                         |  *                       |  Library path  |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  CoreData                |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  Social                  |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  Accounts                |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  AVKit                   |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  Photos                  |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  AuthenticationServices  |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  BackgroundTasks         |  Framework     |  no
  $(SDKROOT)/System/Library/Frameworks                                                             |  AppTrackingTransparency |  Framework     |  no
  ```

  - for ios64 also add:
    
    ```
    Path on remote machine                                                                           |  File mask               |  Path Type     |  Include subdirectories
    $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift/iphoneos             |  *                       |  Library path  |  no
    $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.0/iphoneos         |  *                       |  Library path  |  no
    $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.5/iphoneos         |  *                       |  Library path  |  no
    ```

  - for ios64 SIMULATOR also add:
  
    ``` 
    Path on remote machine                                                                           |  File mask               |  Path Type     |  Include subdirectories
    $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift/iphonesimulator      |  *                       |  Library path  |  no
    $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.0/iphonesimulator  |  *                       |  Library path  |  no
    $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.5/iphonesimulator  |  *                       |  Library path  |  no
    ```

   Make sure you Update Local File Cache.

     
In case you need to downgrade iOS SDK
-------------------------------------

If, for example, Delphi only works with the iOS 11.2 SDK, 
and you install a version of Xcode that does not support 
iOS 11.2 SDK, here’s how to proceed:

  - download xcode 9.2 from https://developer.apple.com/download/more/
  - Unzip the downloaded file in `/Users/zeus/Documents`
  - `sudo cp -r /Users/zeus/Documents/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS.sdk /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS11.2.sdk`
  - `sudo cp -r /Users/zeus/Documents/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator.sdk /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator11.2.sdk`
  - `sudo /usr/libexec/PlistBuddy -c "Set :MinimumSDKVersion 11.2" /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Info.plist`
  - `sudo /usr/libexec/PlistBuddy -c "Set :MinimumSDKVersion 11.2" /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Info.plist`