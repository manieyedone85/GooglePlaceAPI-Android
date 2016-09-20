# GooglePlaceAPI-Android
    *google map place api demo
#GooglePlaceAPI-Android
    google search location and select your location using google place api demo here....

Steps:
1. at gradle ---- to add compile 'com.google.android.gms:play-services:9.2.1'
2. at manifest----- 
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
and inner application tag
    <meta-data
        android:name="com.google.android.geo.API_KEY"
        android:value="Google -API Key here" />

******************Finally the manifest look like******************

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="app.googleplaces">

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">

        <!-- TestMap   manieyedone85@gmail.com -->
        <meta-data
            android:name="com.google.android.geo.API_KEY"
            android:value="paste google api key here" />

        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name=".GoogleMapActivity"
            android:parentActivityName=".MainActivity" />
    </application>

</manifest>

To create to activity one is MainActivity and GoogleMapActivity as well as layout then finaly to create map_menu.xml

Thats it**********************************.

SCREEN SHOTS:

![solarized vim](https://github.com/manieyedone85/GooglePlaceAPI-Android/blob/master/1.PNG)

![solarized vim](https://github.com/manieyedone85/GooglePlaceAPI-Android/blob/master/2.PNG)


![solarized vim](https://github.com/manieyedone85/GooglePlaceAPI-Android/blob/master/3.PNG)

![solarized vim](https://github.com/manieyedone85/GooglePlaceAPI-Android/blob/master/4.PNG)

