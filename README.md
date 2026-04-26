<div align="center">

# 📚 SuperNotes

**Your all-in-one learning companion for Computer Science students**

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://android.com)
[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://java.com)
[![Play Store](https://img.shields.io/badge/Download-Play%20Store-414141?style=for-the-badge&logo=google-play&logoColor=white)](https://play.google.com/store/apps/details?id=com.code.newproject)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-Welcome-brightgreen?style=for-the-badge)](CONTRIBUTING.md)

<br/>

SuperNotes is a free Android app that gives CS students organized access to **notes**, **roadmaps**, **reference books**, and **interview prep** — all offline, all in one place.

[Download App](https://play.google.com/store/apps/details?id=com.code.newproject) • [Report Bug](https://github.com/yourusername/SuperNotes/issues) • [Request Feature](https://github.com/yourusername/SuperNotes/issues)

</div>

---

## 📸 Screenshots

| Dashboard | Notes | Roadmap | Books | MCQs |
|:---------:|:-----:|:-------:|:-----:|:----:|
| *(coming soon)* | *(coming soon)* | *(coming soon)* | *(coming soon)* | *(coming soon)* |

---

## ✨ Features

- 📝 **Structured Notes** — Subject-wise notes for DBMS, CN, OS, DSA, Java, Python and more
- 🗺️ **Roadmaps** — Curated learning paths for Web Dev, Android, DSA, ML, and beyond
- 📚 **Reference Books** — In-app access to essential PDFs and textbooks
- ❓ **Interview Prep** — MCQs and technical questions for placement preparation
- 🏫 **University Support** — Dedicated sections for RTU, SRM, KIIT and other universities
- 🌙 **Dark Mode** — Clean, eye-friendly UI for long study sessions
- 📶 **Offline First** — Core content works without internet connection

---

## 🛠️ Built With

| Technology | Purpose |
|---|---|
| Java | Core Android development |
| XML | UI layouts and resources |
| Google AdMob | In-app ads (keeps the app free) |
| Android Studio | IDE |
| Google Play Console | Publishing & distribution |

---

## 🚀 Getting Started

### Prerequisites

- Android Studio **Hedgehog** or newer
- JDK 11+
- Android SDK with API level 21+

### Setup

1. **Fork** this repository and clone it locally:
   ```bash
   git clone https://github.com/yourusername/SuperNotes.git
   cd SuperNotes
   ```

2. **Open** the project in Android Studio

3. **Add your AdMob ID** — Create a `secrets.xml` file in `app/src/main/res/values/`:
   ```xml
   <resources>
       <string name="admob_app_id">YOUR_ADMOB_APP_ID_HERE</string>
   </resources>
   ```
   And update `AndroidManifest.xml`:
   ```xml
   <meta-data
       android:name="com.google.android.gms.ads.APPLICATION_ID"
       android:value="@string/admob_app_id" />
   ```

4. **Build & Run** on your device or emulator via Android Studio

> ⚠️ **Note:** The app will run in test ad mode if you don't add a real AdMob ID. You only need a real ID if you plan to publish.

---

## 📁 Project Structure

```
SuperNotes/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/code/newproject/
│           │   ├── MainActivity.java        # Entry point & splash
│           │   ├── HomeActivity.java        # Main dashboard
│           │   ├── RoadmapActivity.java     # Learning roadmaps
│           │   ├── InterActivity.java       # Interview questions
│           │   ├── RtuActivity.java         # RTU university section
│           │   └── ...                      # Other subject activities
│           ├── res/
│           │   ├── layout/                  # XML UI files
│           │   ├── drawable-xhdpi/          # Images & assets
│           │   └── values/                  # Colors, strings, styles
│           └── AndroidManifest.xml
├── build.gradle
└── settings.gradle
```

---

## 🤝 Contributing

Contributions are what make open source amazing. Any contribution you make is **greatly appreciated**!

### How to Contribute

1. **Fork** the project
2. **Create** your feature branch: `git checkout -b feature/add-dsa-notes`
3. **Commit** your changes: `git commit -m "Add DSA notes for trees and graphs"`
4. **Push** to the branch: `git push origin feature/add-dsa-notes`
5. **Open a Pull Request**

### What You Can Contribute

- 📝 Notes for new subjects (OS, COA, Compiler Design, etc.)
- 🏫 Support for more universities and their syllabi
- 🐛 Bug fixes and performance improvements
- 🎨 UI/UX improvements
- 🌐 Translations for regional languages

Please read [CONTRIBUTING.md](CONTRIBUTING.md) before submitting a PR.

---

## 🐛 Found a Bug?

Open an issue [here](https://github.com/yourusername/SuperNotes/issues/new) with:
- Device model & Android version
- Steps to reproduce
- Screenshot (if possible)

---

## 📄 License

Distributed under the MIT License. See [`LICENSE`](LICENSE) for more information.

---

## 📬 Contact

Have suggestions or want to collaborate?

- 📧 Email: your@email.com
- 🐦 Twitter/X: [@yourhandle](https://twitter.com/yourhandle)
- 💼 LinkedIn: [Your Name](https://linkedin.com/in/yourprofile)

---

<div align="center">

Made with ❤️ for students, by a student

⭐ **Star this repo if SuperNotes helped you!** ⭐

</div>
