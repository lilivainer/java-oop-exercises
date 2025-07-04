# Assignment – Planes and Trains

This assignment focuses on working with classes, interfaces, inheritance, and polymorphism in Java.

The program simulates a list of vehicles, including planes and trains. Each vehicle has an ID, source, and destination, and can perform actions such as reporting its details and switching its direction (source ↔ destination).

Two interfaces are used:
- `Movable` – for objects that can move and report their state.
- `Comparable` – for sorting objects based on their internal properties (e.g., height or passenger count).

An abstract class `Vehicle` defines shared attributes and behavior for both planes and trains.

- The `Plane` class includes a field for maximum altitude and compares objects by height.
- The `Train` class includes a field for maximum passengers and compares objects by passenger count.

The `AirportInfo` class provides helper methods for sorting arrays of vehicles and generating summary reports.

The main class `TestAirportInfo` demonstrates:
- Creating arrays of random planes and trains
- Sorting them based on their type
- Printing formatted reports before and after moving
- Using polymorphism with a `Movable[]` array that holds both types

This task highlights object-oriented design and the use of interfaces and abstract classes in organizing related types of objects.
