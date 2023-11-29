ANDROID
-------

https://adoptium.net/
Download the Windows installer (msi) for 
Operating System: Windows 
Architecture: x64 
Package Type: jdk 
Version: 8 
and then just run the installation. In the install dialog select only:
* Update path
* Associate .jar
* Set JAVA_HOME variable

download the last Command line tools from:
https:developer.android.com/studio#command-tools
Or use the one located in (if already installed)
c:\Dev\MagicFoundation\PlatformSDKs\android\cmdline-tools\8.0\bin

To list installed and available packages:
"c:\Dev\MagicFoundation\PlatformSDKs\android\cmdline-tools\8.0\bin\sdkmanager.bat" --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\android\ --list

To reinstall from scratch all the android SDK/NDK:
"c:\Dev\MagicFoundation\PlatformSDKs\android\cmdline-tools\8.0\bin\sdkmanager.bat"^
 "build-tools;29.0.3"^
 "build-tools;30.0.3"^
 "build-tools;32.0.0"^
 "build-tools;33.0.1"^
 "build-tools;33.0.2"^
 "build-tools;34.0.0"^
 "cmdline-tools;3.0"^
 "cmdline-tools;7.0"^
 "cmdline-tools;8.0"^
 "cmdline-tools;9.0"^
 "emulator"^
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
 --sdk_root=c:\Dev\MagicFoundation\PlatformSDKs\android\

to create an emulator:
"c:\Dev\MagicFoundation\PlatformSDKs\android\cmdline-tools\8.0\bin\avdmanager.bat" create avd -n android13 -k "system-images;android-33;google_apis;arm64-v8a"
but this fail: 
https://stackoverflow.com/questions/74760027/exception-during-avdmanager-initialization
https://github.com/ReactiveCircus/android-emulator-runner/issues/235
 
 
IOS
---

* Install lastest macOS (Big Sur?) on a VMWare instance and forget virtualbox, it's just a #@{^}
* In the macOS, from the app store, install XCode
* In the macOS install c:\Program Files (x86)\Embarcadero\Studio\23.0\PAServer\PAServer23.0.pkg

* In the Keychain Access application on your Mac, select from the Keychain Access menu: 
  Certificate Assistant > Request a Certificate From a Certificate Authority:
    User Email Address: apple@kiskis.club
    Common name: developer.apple.com
    CA Email Address: {leaveEmpty} 
    Save to Disk: {Checked}
  then save the certificate somewhere on the disk
  
* Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
* select iOS App Development
* select the certificate previously saved
* download the new certificate
* Launch the Development Certificate by double-clicking it. It automatically loads in the Keychain Access application.
* If you get "certificate is not trusted" red warning in keychain when looking the new installed certificate then: https://developer.apple.com/forums/thread/662300

* Go to https://developer.apple.com/account/resources/certificates/list and click (+) to add a new certificate
* select iOS Distribution (App Store and Ad Hoc)
* select the certificate previously saved
* download the new certificate
* Launch the Development Certificate by double-clicking it. It automatically loads in the Keychain Access application.

* Go to https://developer.apple.com/account/resources/identifiers/list and click (+) to add a new profile
* Select App IDs
* Select App
* Description: XC Wildcard
  Bundle ID: .* (wildcard)

* Go to https://developer.apple.com/account/resources/identifiers/list and click (+) to add a new profile
* Select App IDs
* Select App
* Description: KisKis iOS App
  Bundle ID: club.kiskis.app.ios (explicit)
  Associated Domains: YES
  Sign In with Apple: YES (Enable as a primary App ID)
  Push Notifications: YES

* Go to https://developer.apple.com/account/resources/profiles/list and click (+) to add a new profile
* Select iOS App Development
* Select XC Wildcard
* Select All Certificate
* ....
* Download your new provisioning profile
* Double click on it to install it
* Verify that the provisioning profile is well installed in /Users/zeus/Library/MobileDevice/Provisioning Profiles/
  * Right click on each file and select "get info"
  * delete the unwanted provisioning profiles
* Open Xcode on the Mac and go to the Devices (Window > Devices).
* Right-click the device (ex the iphone 7) and select Show Provisioning Profiles…
* If you do not see your new provisioning profile: 
  * Click the plus sign button to add a provisioning profile.
  * Find your provisioning profile, select it and click Install.
  * Click Done to close the window.
* Delete also all unwanted Provisioning Profile from your mobile device


Configure Delphi to use the framework SDKs
------------------------------------------

* Download and Install OpenJDK11U-jdk_x64_windows_hotspot_11.0.16.1_1 (or newer)

* Tools > Options > Environment Variables > User overrides
      > New
      > Variable Name: BDSPLATFORMSDKSDIR
      > Variable Value: c:\Dev\MagicFoundation\PlatformSDKs
      
* Tools > Options > Deployment > Connection Profile Manager
      > Add
      > Profile name: VMWare
      > Platform: macOS 64-bit
      > Remote Machine (IP address or Machine name): 192.168.161.128
      > Port number: 64211
      > password:
      
* Save c:\Dev\MagicFoundation\PlatformSDKs folder somewhere (in case)

* delete iPhoneOSxxx.sdk, iPhoneSimulatorxxx.sdk and MacOSXxxx.sdk inside the c:\Dev\MagicFoundation\PlatformSDKs

* Tools > Options > Deployment > SDK Manager
      > Add
      > macOS 64 bit     
      
*  Tools > Options > Deployment > SDK Manager
      > Add
      > macOS ARM 64 bit      
      
*  Tools > Options > Deployment > SDK Manager
      > Add
      > iOS Simulator ARM 64 bit      
      
*  Tools > Options > Deployment > SDK Manager
      > Add
      > iOS device 64 bit    
        
*  Tools > Options > Deployment > SDK Manager
      > Add
      > android 32 bit   
      
      !!WARNING!! Take a look of this post before to change anything below:
      https://stackoverflow.com/questions/60084704/aab-format-return-an-apk-without-armeabi-v7a-library-under-32-bit-devices
      Under Tools, Options, Deployment, SDK Manager you will need to add the following frameworks:

      ANDROID 32 BIT SDK
      c:\Dev\MagicFoundation\PlatformSDKs\Android\
      c:\Dev\MagicFoundation\PlatformSDKs\Android\build-tools\34.0.0\zipalign.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\build-tools\34.0.0\lib\apksigner.jar
      c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\9.0\bin\avdmanager.bat
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platform-tools\adb.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\build-tools\34.0.0\aapt.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platforms\android-34

      ANDROID 32 BIT NDK
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\arm-linux-androideabi-4.9\prebuilt\windows-x86_64\bin\arm-linux-androideabi-ld.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\arm-linux-androideabi-4.9\prebuilt\windows-x86_64\bin\arm-linux-androideabi-strip.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\prebuilt\android-arm\gdbserver\gdbserver
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm\usr\lib
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm\usr\lib;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\sources\cxx-stl\llvm-libc++\libs\armeabi-v7a

      ANDROID 32 BIT JAVA
      C:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\bin\keytool.exe
      C:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\bin\jarsigner.exe
         
*  Tools > Options > Deployment > SDK Manager
      > Add
      > android 64 bit

      !!WARNING!! Take a look of this post before to change anything below:
      https://stackoverflow.com/questions/60084704/aab-format-return-an-apk-without-armeabi-v7a-library-under-32-bit-devices
      Under Tools, Options, Deployment, SDK Manager you will need to add the following frameworks:

      ANDROID 64 BIT SDK
      c:\Dev\MagicFoundation\PlatformSDKs\Android\
      c:\Dev\MagicFoundation\PlatformSDKs\Android\build-tools\34.0.0\zipalign.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\build-tools\34.0.0\lib\apksigner.jar
      c:\Dev\MagicFoundation\PlatformSDKs\Android\cmdline-tools\9.0\bin\avdmanager.bat
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platform-tools\adb.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\build-tools\34.0.0\aapt.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\platforms\android-34

      ANDROID 64 BIT NDK
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\aarch64-linux-android-4.9\prebuilt\windows-x86_64\aarch64-linux-android\bin\ld.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\toolchains\aarch64-linux-android-4.9\prebuilt\windows-x86_64\aarch64-linux-android\bin\strip.exe
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\prebuilt\android-arm64\gdbserver\gdbserver
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm64\usr\lib
      c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\platforms\android-23\arch-arm64\usr\lib;c:\Dev\MagicFoundation\PlatformSDKs\Android\ndk\21.4.7075529\sources\cxx-stl\llvm-libc++\libs\arm64-v8a

      ANDROID 64 BIT JAVA
      C:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\bin\keytool.exe
      C:\Program Files\Eclipse Adoptium\jdk-11.0.16.101-hotspot\bin\jarsigner.exe
      
*  Under Tools, Options, SDK Manager you will need to add the following frameworks for ios64 and Ios64 simulator:
      
      Path on remote machine                                                                    |  File mask               |  Path Type     |  Include subdirectories
      $(SDKROOT)/usr/lib/swift                                                                  |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift/iphoneos      |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.0/iphoneos  |  *                       |  Library path  |  no
      $(SDKROOT)/../../../../../Toolchains/XcodeDefault.xctoolchain/usr/lib/swift-5.5/iphoneos  |  *                       |  Library path  |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  CoreData                |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  Social                  |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  Accounts                |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  AVKit                   |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  Photos                  |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  AuthenticationServices  |  Framework     |  no
      $(SDKROOT)/System/Library/Frameworks                                                      |  BackgroundTasks         |  Framework     |  no

      make sure you Update Local File Cache.

      https://quality.embarcadero.com/browse/RSP-38700
      You will need to manually copy the content of (assuming c:\Dev\MagicFoundation\PlatformSDKs is your BDSPLATFORMSDKSDIR)
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS16.4.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS16.1.sdk\usr\lib\swift
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS16.4.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift-5.0  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS16.1.sdk\usr\lib\swift-5.0
      c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS16.4.sdk\Applications\Xcode.app\Contents\Developer\Toolchains\XcodeDefault.xctoolchain\usr\lib\swift-5.5  to  c:\Dev\MagicFoundation\PlatformSDKs\iPhoneOS16.1.sdk\usr\lib\swift-5.5


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