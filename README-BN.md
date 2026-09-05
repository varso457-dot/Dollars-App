# Dollar BD Converter

## কীভাবে কাজ করে
Dollar Amount × Dollar Rate = বাংলাদেশি টাকা।

উদাহরণ:
Rate = 130
Amount = 10
Result = ৳1,300.00

## APK বানানো
1. Android Studio ইনস্টল করো।
2. এই ZIP Extract করো।
3. Android Studio → Open → `DollarBDConverter` folder।
4. Gradle Sync শেষ হতে দাও।
5. Build → Build App Bundle(s) / APK(s) → Build APK(s)।

Debug APK:
`app/build/outputs/apk/debug/app-debug.apk`

## Play Store
Play Store-এর জন্য Release-এর signed AAB তৈরি করো:
Build → Generate Signed Bundle / APK → Android App Bundle

## নোট
এই version-এ rate manual। Internet/API ছাড়া তুমি যে rate দেবে সেই rate অনুযায়ী হিসাব হবে।
