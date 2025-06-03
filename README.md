# Chess Movement Simulator

A simple Java console application that simulates legal movements for **King**, **Queen**, and **Pawn** on an 8x8 empty chessboard.

---

## 💡 Features

- Supports input like `King, D5`
- Outputs all valid move positions from that location
- Clean, modular object-oriented design
- Fully covered with JUnit 4 unit tests
- Built using Maven

---

## 🧩 Supported Pieces and Movements

| Piece  | Movement                                                                 |
|--------|--------------------------------------------------------------------------|
| Pawn   | 1 step forward (white side only)                                         |
| King   | 1 step in any direction                                                  |
| Queen  | Any number of steps in 8 directions (horizontal, vertical, diagonal)     |

---

## 📦 Project Structure

chess-movement-simulator/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── model/ # Piece classes (King, Queen, Pawn)
│ │ │ ├── factory/ # PieceFactory for dynamic instantiation
│ │ │ ├── util/ # Position class and helper engine
│ │ │ └── ChessBoard.java # Main class with Scanner input
│ └── test/
│ └── java/
│ ├── model/ # Tests for piece logic
│ ├── factory/ # Tests for PieceFactory
│ ├── util/ # Tests for Position and Engine
│ └── ChessBoardTest.java
├── pom.xml
└── README.md



---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/chess-movement-simulator.git
cd chess-movement-simulator

## 🚀 Build the Project
mvn clean compile
