1) Size is a variable so you dont need to make getters or setters since size is already in the subclass
2) Replacing cards is the same no matter what game is being played, so it doesn't need to be abstract.
3) They would still be called polymorphically, and the alternate design would work as well. Everything needs to be implemented separately for each game class though.