# Console Task Manager

A Java console practice project for reading tasks from a text file and appending new tasks. Built to practice classes, console input, file handling, and exception handling.

## Current features

- Display tasks saved in `filename.txt`.
- Add a task by running the separate `addList` class.
- Keep tasks in the text file between runs.

The main menu is still in progress. Its add, complete, and delete options currently print a selection message; they do not perform those actions. Adding a task works through `addList`.

## Run locally

Install a Java Development Kit (JDK), clone or download the repository, and open a terminal in the project folder.

```sh
javac Main.java list.java displayList.java addList.java
java Main
```

Choose option `1` to display the saved list. To add a task, run:

```sh
java addList
```

Type a task and press Enter. Run the programs from the repository folder so they can find `filename.txt`.

## Files

- `Main.java`: menu and display selection.
- `list.java`: reads the saved tasks when selected from the menu.
- `displayList.java`: standalone display program.
- `addList.java`: appends a task to the text file.
- `filename.txt`: sample task data.

## Planned work

Connect task addition to the menu, implement completion and deletion, and improve input validation.
