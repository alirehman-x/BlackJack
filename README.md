# ♠️ BlackJack — Java Console Game

A command-line Blackjack game built in Java using object-oriented principles.

---

## 🃏 How to Play

### Blackjack Rules
- The goal is to get a hand value as close to **21** as possible without going over.
- **Number cards (2–10)** are worth their face value.
- **Face cards (Jack, Queen, King)** are worth **10**.
- **Ace** is worth **11**, but counts as **1** if the total exceeds 21.
- You play against the **Dealer**.

### Gameplay
1. Both the player and dealer are dealt **2 cards**.
2. One of the dealer's cards is **hidden** (the hole card).
3. On your turn, choose:
   - **H** — Hit (take another card)
   - **S** — Stand (keep your current hand)
4. If your total exceeds **21**, you **bust** and lose.
5. After the player stands, the dealer **reveals** their hole card.
6. The dealer must **hit until their total is 17 or higher**.
7. Whoever is closer to 21 without busting **wins**.
8. If totals are equal, it's a **Push** (tie).

---

## 🗂️ Project Structure

```
src/
├── Card.java         # Represents a single playing card
├── Deck.java         # 52-card deck with shuffle and draw logic
├── Hand.java         # Base class for holding and evaluating cards
├── DealersHand.java  # Extends Hand with hole card reveal logic
└── Main.java         # Game loop and user interaction
```

---

## ▶️ How to Run

1. Clone the repo:
```bash
git clone https://github.com/alirehman-x/BlackJack.git
```
2. Open in **IntelliJ IDEA** (or any Java IDE).
3. Run `Main.java`.

---

## 🛠️ Built With

- Java (OOP — Inheritance, Encapsulation, Polymorphism)
- No external libraries

---

## 👤 Author

**Ali Rehman** — [@alirehman-x](https://github.com/alirehman-x)
