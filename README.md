
# 🧠 Habit Tracker - CPIT 305 Final Project

> A modern Java desktop application to build better habits with reminders, weekly goals, and visual statistics.

---

## 🎯 Problem Statement

Staying consistent with habits is hard. Many students struggle to track progress, stay motivated, or receive reminders to stay on track. This project provides a complete **habit tracking system** with customizable goals, motivational UI, daily reminders, and progress insights — built using **Java Swing**, **Sockets**, **SQLite**, and **Multi-threading**.

---

## 💡 Features

- 📆 Add habits with weekly targets and custom reminder days
- 🧠 AI-based habit suggestions (e.g. health, fitness, study)
- 🔔 Reminder system using background threads
- 🌐 Client-server syncing with TCP sockets
- 📊 Progress reports with charts and statistics
- 📌 Widgets for summaries, streaks, and achievements
- 💾 Local storage using SQLite with full CRUD support
- 💡 FlatLaf modern UI theme for a clean, professional design

---

## 🛠️ Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| UI          | Java Swing + FlatLaf |
| Database    | SQLite (via JDBC)  |
| Threads     | Custom ReminderThread class |
| Networking  | TCP Client/Server (Java Socket API) |
| Testing     | JUnit 5            |
| Build Tool  | Maven              |

---

## 🧪 Running the Project

### ✅ Requirements
- Java 19+
- Maven (or use NetBeans 16+)
- Internet not required (uses local database)

### ▶️ Run in NetBeans
1. Import the project into NetBeans 16
2. Run the `Main` class inside `projects.Main`
3. To run tests, right-click `DatabaseManagerTest.java` → **Test File**

### ▶️ Run via Maven CLI

```bash
cd HabitTracke
mvn clean compile exec:java
```

### ▶️ Run Tests

```bash
mvn test
```

---

## 📸 Screenshots

### 🏠 Home (Habits List)
![Habits Tab](screenshots/habits_tab.png)

### 📆 Reports View
![Reports Tab](screenshots/reports_tab.png)

### 📊 Statistics Dashboard
![Statistics Tab](screenshots/stats_tab.png)

> _(*Add your real screenshots in a `screenshots/` folder)*_

---

## 📂 Project Structure

```
src/
├── main/java/projects/
│   ├── Main.java
│   ├── MainFrame.java
│   ├── Habit.java
│   ├── DatabaseManager.java
│   ├── HabitSuggester.java
│   ├── HabitSyncClient.java
│   ├── HabitSyncServer.java
│   └── ReminderThread.java
└── test/java/projects/
    └── DatabaseManagerTest.java
```

---

## 👥 Team Members

- 🧑‍💻 Name 1 (e.g., Yazan Alsaadi)  
- 🧑‍💻 Name 2  
- 🧑‍💻 Name 3 *(if applicable)*

> Please replace with real names for submission.

---

## 📚 Acknowledgements

- FlatLaf for the modern UI look
- JUnit 5 for unit testing framework
- Xerial SQLite JDBC for local DB support

---

## 🏁 Final Notes

This project demonstrates advanced programming concepts learned in **CPIT 305**, including:

- Effective use of Java Threads and synchronization
- Client-server communication via Java Sockets
- Persistent data management with SQL
- UI/UX design in Java Swing
- Unit testing using JUnit

We hope this tool helps users stay more consistent, healthy, and productive 💪.
