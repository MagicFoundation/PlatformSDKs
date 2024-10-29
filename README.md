ANDROID
-------
 
* Install OpenJDK Binaries 11 and 17. 
  https://adoptium.net/
  Download the ZIP package for 
    * Operating System: Windows 
    * Architecture: x64 
    * Package Type: jdk 
    * Version: 11 and 17
  and then UnZip it to 
    * c:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\
    * c:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\
  then Add/Update in environment variables system PATH (!!!only via the GUI, do not use #{@#{^ command line like setx that will truncate path to 1024 chars!!!)
    * c:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\bin\
  and finally add/Update environment variables system JAVA_HOME
    * JAVA_HOME = c:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\

* Retrieve PlatformSDKs from git https://github.com/MagicFoundation/PlatformSDKs.git

* To list installed and available packages:
  "c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\sdkmanager.bat" --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\Android\ --list

* To reinstall from scratch all the android SDK/NDK:
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
 "ndk;21.4.7075529"^
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

* To unistall a package : 
  "c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\sdkmanager.bat" --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\Android\ --uninstall "build-tools;33.0.1"

* Commit c:\Dev\MagicFoundation\PlatformSDKs\Android

* to create an emulator (not work anymore on Intel):
  "c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\16.0\bin\avdmanager.bat" create avd -n android13 -k "system-images;android-33;google_apis;arm64-v8a"
  but this fail: 
  https://stackoverflow.com/questions/74760027/exception-during-avdmanager-initialization
  https://github.com/ReactiveCircus/android-emulator-runner/issues/235
 
 
IOS
---

* Install the lastest macOS on a VMWare instance. 
  Follow the instructions: {MagicFoundation}\Softwares\MacOS\README.md
* In the macOS, from the app store, install XCode. You will need to 
  enter your your apple ID email and password. 
* Launch XCode and select macOS and iOS plateform
* Install in Macos: c:\Program Files (x86)\Embarcadero\Studio\23.0\PAServer\PAServer23.0.pkg
* Go in Finder > Applications > right click on PAServer 23 icon and select Open. if you receive
  the error message saying "PAServer 23 damaged and cannot be opened" then click again on the 
  "Open" button (Temporarily bypass security features by right-clicking the app and selecting Open twice)
  https://iboysoft.com/news/app-is-damaged-and-cannot-be-opened.html
* Go in Finder > Applications > drag and drop PAServer-23 icon to the desktop to create a short link
* Launch PAServer-23

* Finder > Applications > Utilities > Keychain Access (select Open Keychain Access in popup dialog)
* Select "System" keychain in the left panel
* Menu > Keychain Access > Certificate Assistant > Request a Certificate From a Certificate Authority:
    * User Email Address: {Your apple ID Email}
    * Common name: developer.apple.com
    * CA Email Address: {leaveEmpty} 
    * Save to Disk: {Checked}
  then save the certificate somewhere on the disk
  
* Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
* select iOS App Development
* select the certificate previously saved
* download the new certificate
* IMPORTANT: Select "System" keychain in the left panel of the Keychain Access utilities
* Launch the Certificate by double-clicking it. It automatically loads in the Keychain Access application.
* If asked, in the "add certificates" popup dialog select "System" Keychain
* If you get "certificate is not trusted" red warning in keychain when looking the new installed certificate then install
  also this certificate: https://www.apple.com/certificateauthority/AppleWWDRCAG3.cer

* Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
* select iOS Distribution (App Store and Ad Hoc)
* select the certificate previously saved
* download the new certificate
* IMPORTANT: Select "System" keychain in the left panel of the Keychain Access utilities
* Launch the Certificate by double-clicking it. It automatically loads in the Keychain Access application.
* If asked, in the "add certificates" popup dialog select "System" Keychain
* Exit keychain access 

* Go to https://developer.apple.com/account/resources/identifiers/list and click (+) to add a new identifier
* Select App IDs
* Select App
* Description: XC Wildcard
  Bundle ID: .* (wildcard)

* Go to https://developer.apple.com/account/resources/identifiers/list and click (+) to add a new identifier
* Select App IDs
* Select App
* Description: {AppName} iOS App
  Bundle ID: {Domain in lowercase}.{AppName in lowercase}.app.ios (explicit)
  Associated Domains: YES
  Sign In with Apple: YES (Enable as a primary App ID)
  Push Notifications: YES

* Go to https://developer.apple.com/account/resources/profiles/list and click (+) to add a new profile
* Select iOS App Development
* Select XC Wildcard
* Select All Certificate
* Select All devices and include mac devices
* Name it XC Wildcard (development)
* Download your new provisioning profile
* Double click on it to install it
* Verify that the provisioning profile is well installed in /Users/zeus/Library/MobileDevice/Provisioning Profiles/
  * Right click on each file and select "get info"
  * delete the unwanted provisioning profiles
* Open Xcode on the Mac and go to the Devices (Window > Devices).
* Right-click the device (ex the iphone 7) and select Show Provisioning Profiles…
* Delete all unwanted Provisioning Profile from your mobile device
* Install an app from delphi in the mobile device. This will also install the provisioning 
  profile in the mobile device.


Configure Delphi to use the framework SDKs
------------------------------------------

* Tools > Options > IDE > Environment Variables > User overrides
      > New
      > Variable Name: BDSPLATFORMSDKSDIR
      > Variable Value: c:\Dev\MagicFoundation\PlatformSDKs
      
* Tools > Options > Deployment > Connection Profile Manager
      > Add
      > Profile name: VMWare
      > Platform: macOS 64-bit
      > Remote Machine (IP address or Machine name): 192.168.80.129
      > Port number: 64211
      > password:
      
* Save c:\Dev\MagicFoundation\PlatformSDKs folder somewhere (in case)

* delete iPhoneOSxxx.sdk, iPhoneSimulatorxxx.sdk and MacOSXxxx.sdk inside the c:\Dev\MagicFoundation\PlatformSDKs

* Tools > Options > Deployment > SDK Manager
      > Add
      > macOS 64 bit   
      > if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
        https://quality.embarcadero.com/browse/RSP-41260 
      
*  Tools > Options > Deployment > SDK Manager
      > Add
      > macOS ARM 64 bit      
      > if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
        https://quality.embarcadero.com/browse/RSP-41260 
      
*  Tools > Options > Deployment > SDK Manager
      > Add
      > iOS Simulator ARM 64 bit      
      > if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
        https://quality.embarcadero.com/browse/RSP-41260 
      
*  Tools > Options > Deployment > SDK Manager
      > Add
      > iOS device 64 bit    
      > if the Connection with Delphi <-> MacOS PAServer is very slow take a look at 
        https://quality.embarcadero.com/browse/RSP-41260 
        
*  Tools > Options > Deployment > SDK Manager
      > Add
      > android 32 bit   
      
      !!WARNING!! Take a look of this post before to change anything below:
      https://stackoverflow.com/questions/60084704/aab-format-return-an-apk-without-armeabi-v7a-library-under-32-bit-devices
      Under Tools, Options, Deployment, SDK Manager you will need to add the following frameworks:
      
      c:\Dev\MagicFoundation\PlatformSDKs\Android
      c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\11.0\bin\avdmanager.bat
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platform-tools\adb.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platforms\android-35
      //--
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\arm-linux-androideabi-4.9\prebuilt\windows-x86_64\bin\arm-linux-androideabi-ld.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\arm-linux-androideabi-4.9\prebuilt\windows-x86_64\bin\arm-linux-androideabi-strip.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm\usr\lib
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\sources\cxx-stl\llvm-libc++\libs\armeabi-v7a;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm\usr\lib;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\arm-linux-androideabi-4.9\prebuilt\windows-x86_64\lib\gcc\arm-linux-androideabi\4.9.x;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\arm-linux-androideabi-4.9\prebuilt\windows-x86_64\arm-linux-androideabi\lib
      //--     
      C:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\bin\keytool.exe
      C:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\bin\jarsigner.exe
                     
*  Tools > Options > Deployment > SDK Manager
      > Add
      > android 64 bit

      !!WARNING!! Take a look of this post before to change anything below:
      https://stackoverflow.com/questions/60084704/aab-format-return-an-apk-without-armeabi-v7a-library-under-32-bit-devices
      Under Tools, Options, Deployment, SDK Manager you will need to add the following frameworks:

      c:\Dev\MagicFoundation\PlatformSDKs\Android
      c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\11.0\bin\avdmanager.bat
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platform-tools\adb.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platforms\android-35
      //--
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\aarch64-linux-android-4.9\prebuilt\windows-x86_64\aarch64-linux-android\bin\ld.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\aarch64-linux-android-4.9\prebuilt\windows-x86_64\aarch64-linux-android\bin\strip.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm64\usr\lib
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm64\usr\lib;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\sources\cxx-stl\llvm-libc++\libs\arm64-v8a
      //--     
      C:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\bin\keytool.exe
      C:\Program Files\Eclipse Adoptium\jdk-17.0.12.7-hotspot\bin\jarsigner.exe
      
*  Under Tools, Options, SDK Manager you will need to add the following frameworks for ios64 and ios64 Simulator :
      
      Path on remote machine                                                                           |  File mask               |  Path Type     |  Include subdirectories
      $(SDKROOT)/usr/lib/swift                                                                         |  *                       |  Library path  |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  CoreData                |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  Social                  |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  Accounts                |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  AVKit                   |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  Photos                  |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  AuthenticationServices  |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                             |  BackgroundTasks         |  Framework     |  no

   for ios64 also add:
      Path on remote machine                                                                           |  File mask               |  Path Type     |  Include subdirectories
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift/iphoneos             |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.0/iphoneos         |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.5/iphoneos         |  *                       |  Library path  |  no

   for ios64 SIMULATOR also add:
      Path on remote machine                                                                           |  File mask               |  Path Type     |  Include subdirectories
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift/iphonesimulator      |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.0/iphonesimulator  |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.5/iphonesimulator  |  *                       |  Library path  |  no

   make sure you Update Local File Cache.

   https://quality.embarcadero.com/browse/RSP-38700
   You will need to manually copy the content of (assuming c:\Dev\MagicFoundation\PlatformSDKs is your BDSPLATFORMSDKSDIR)

   for ios64:
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS17.5.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS17.5.sdk\usr\lib\swift
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS17.5.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift-5.0  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS17.5.sdk\usr\lib\swift-5.0
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS17.5.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift-5.5  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS17.5.sdk\usr\lib\swift-5.5

   for ios64 SIMULATOR:
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneSimulator17.5.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneSimulator17.5.sdk\usr\lib\swift
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneSimulator17.5.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift-5.0  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneSimulator17.5.sdk\usr\lib\swift-5.0
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneSimulator17.5.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift-5.5  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneSimulator17.5.sdk\usr\lib\swift-5.5
      
     
     
     
     
|  (In case you need to downgrade iOS SDK)
|  ---------------------------------------
|
|  If for example Delphi work only with iOS 11.2 SDK
|  If you install a version of xcode that not support iOS 11.2 SDK then this is how to do
|  download xcode 9.2 from https://developer.apple.com/download/more/
|  Unzip the downloaded file in /Users/zeus/Documents
|  sudo cp -r /Users/zeus/Documents/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS.sdk /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS11.2.sdk
|  sudo cp -r /Users/zeus/Documents/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator.sdk /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator11.2.sdk
|  sudo /usr/libexec/PlistBuddy -c "Set :MinimumSDKVersion 11.2" /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Info.plist
|  sudo /usr/libexec/PlistBuddy -c "Set :MinimumSDKVersion 11.2" /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Info.plist

| (not need anymore)
| ------------------
|
| if you receive the error    Error: "___isOSVersionAtLeast", referenced from:     ....
| or if you don't find the c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS12.2.sdk\usr\lib\clang directory
| then it's maybe the setting in tools, Options, SDK Manager is wrong. so look
| in mac os for MainDrive > Applications > Xcode > Contents > Developer >
| Toolchains > XcodeDefault.xctoolchain > usr > lib > clang > 10.0.1 then go
| back in  Options, SDK Manager update the path of CLANG (ex 10.0.0) to 10.0.1
| and click Update Local File Cache.