package com.rowan.quiz_app_with_firebase;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
public static ArrayList<modelclass> quizQuestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        quizQuestions =new ArrayList<>();
        quizQuestions.add(new modelclass("What is the next number in the sequence 2, 6, 12, 20, 30?", "42", "36", "38", "40", "42"));
        quizQuestions.add(new modelclass("What is the odd one out: Dog, Cat, Elephant, Snake, Fish?", "Snake", "Dog", "Cat", "Elephant", "Snake"));
        quizQuestions.add(new modelclass("What is the next letter in the sequence A, C, F, J, O?", "S", "Q", "R", "S", "T"));
        quizQuestions.add(new modelclass("If all Bloops are Razzies and all Razzies are Lazzies, are all Bloops definitely Lazzies?", "Yes", "Yes", "No", "Maybe", "Cannot be determined"));
        quizQuestions.add(new modelclass("What number should come next in the pattern: 1, 4, 9, 16, 25?", "36", "30", "32", "34", "36"));
        quizQuestions.add(new modelclass("Which one of the following is least like the others? A. Pot B. Pan C. Fork D. Plate", "Fork", "Pot", "Pan", "Fork", "Plate"));
        quizQuestions.add(new modelclass("Mary is taller than Kate but shorter than Jen. Who is the shortest?", "Kate", "Mary", "Kate", "Jen", "Cannot be determined"));
        quizQuestions.add(new modelclass("If there are 6 apples and you take away 4, how many do you have?", "4", "2", "4", "6", "0"));
        quizQuestions.add(new modelclass("What is the value of 3/4 of 4/5 of 500?", "300", "375", "400", "300", "250"));
        quizQuestions.add(new modelclass("If 5x = 2y, what is x in terms of y?", "2/5y", "5/2y", "2/5y", "y/5", "5/y"));
        quizQuestions.add(new modelclass("What is the next number in the sequence 5, 11, 17, 23?", "29", "29", "27", "25", "31"));
        quizQuestions.add(new modelclass("Which word is a synonym for 'fastidious'?", "Meticulous", "Hasty", "Meticulous", "Sloppy", "Careless"));
        quizQuestions.add(new modelclass("How many sides does a dodecagon have?", "12", "10", "12", "14", "16"));
        quizQuestions.add(new modelclass("Which of the following is not a prime number?", "15", "13", "15", "17", "19"));
        quizQuestions.add(new modelclass("What is the 8th letter of the alphabet?", "H", "G", "H", "I", "J"));
        quizQuestions.add(new modelclass("What is the square root of 81?", "9", "8", "9", "10", "7"));
        quizQuestions.add(new modelclass("If you rearrange the letters 'CIFAIPC' you would have the name of a(n):", "Ocean", "City", "Animal", "Country", "Ocean"));
        quizQuestions.add(new modelclass("How many bones are there in the human body?", "206", "205", "206", "207", "208"));
        quizQuestions.add(new modelclass("What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris"));
        quizQuestions.add(new modelclass("Which planet is known as the Red Planet?", "Mars", "Earth", "Jupiter", "Mars", "Venus"));
        quizQuestions.add(new modelclass("What is the chemical symbol for water?", "H2O", "O2", "CO2", "H2O", "H2"));
        quizQuestions.add(new modelclass("What is the speed of light?", "299,792,458 m/s", "300,000,000 m/s", "299,792,458 m/s", "150,000,000 m/s", "250,000,000 m/s"));
        quizQuestions.add(new modelclass("Which country is the largest by area?", "Russia", "Canada", "China", "Russia", "USA"));
        quizQuestions.add(new modelclass("Who wrote 'Hamlet'?", "Shakespeare", "Dickens", "Shakespeare", "Tolkien", "Hemingway"));
        quizQuestions.add(new modelclass("What is the currency of Japan?", "Yen", "Dollar", "Euro", "Yen", "Won"));
        quizQuestions.add(new modelclass("What is the smallest prime number?", "2", "1", "2", "3", "5"));
        quizQuestions.add(new modelclass("What is the capital of Italy?", "Rome", "Paris", "London", "Berlin", "Rome"));
        quizQuestions.add(new modelclass("Which ocean is the largest?", "Pacific", "Atlantic", "Indian", "Pacific", "Arctic"));
        quizQuestions.add(new modelclass("How many continents are there?", "7", "5", "6", "7", "8"));
        quizQuestions.add(new modelclass("What is the largest planet in our solar system?", "Jupiter", "Earth", "Mars", "Jupiter", "Saturn"));
        quizQuestions.add(new modelclass("What is the boiling point of water?", "100°C", "90°C", "100°C", "110°C", "120°C"));
        quizQuestions.add(new modelclass("Which country is known as the Land of the Rising Sun?", "Japan", "China", "Japan", "Korea", "Thailand"));
        quizQuestions.add(new modelclass("What is the longest river in the world?", "Nile", "Amazon", "Nile", "Yangtze", "Mississippi"));
        quizQuestions.add(new modelclass("What is the next number in the sequence 2, 6, 12, 20, 30?", "42", "36", "38", "40", "42"));
        quizQuestions.add(new modelclass("What is the odd one out: Dog, Cat, Elephant, Snake, Fish?", "Snake", "Dog", "Cat", "Elephant", "Snake"));
        quizQuestions.add(new modelclass("What is the next letter in the sequence A, C, F, J, O?", "S", "Q", "R", "S", "T"));
        quizQuestions.add(new modelclass("If all Bloops are Razzies and all Razzies are Lazzies, are all Bloops definitely Lazzies?", "Yes", "Yes", "No", "Maybe", "Cannot be determined"));
        quizQuestions.add(new modelclass("What number should come next in the pattern: 1, 4, 9, 16, 25?", "36", "30", "32", "34", "36"));
        quizQuestions.add(new modelclass("Which one of the following is least like the others? A. Pot B. Pan C. Fork D. Plate", "Fork", "Pot", "Pan", "Fork", "Plate"));
        quizQuestions.add(new modelclass("Mary is taller than Kate but shorter than Jen. Who is the shortest?", "Kate", "Mary", "Kate", "Jen", "Cannot be determined"));
        quizQuestions.add(new modelclass("If there are 6 apples and you take away 4, how many do you have?", "4", "2", "4", "6", "0"));
        quizQuestions.add(new modelclass("What is the value of 3/4 of 4/5 of 500?", "300", "375", "400", "300", "250"));
        quizQuestions.add(new modelclass("If 5x = 2y, what is x in terms of y?", "2/5y", "5/2y", "2/5y", "y/5", "5/y"));
        quizQuestions.add(new modelclass("What is the next number in the sequence 5, 11, 17, 23?", "29", "29", "27", "25", "31"));
        quizQuestions.add(new modelclass("Which word is a synonym for 'fastidious'?", "Meticulous", "Hasty", "Meticulous", "Sloppy", "Careless"));
        quizQuestions.add(new modelclass("How many sides does a dodecagon have?", "12", "10", "12", "14", "16"));
        quizQuestions.add(new modelclass("Which of the following is not a prime number?", "15", "13", "15", "17", "19"));
        quizQuestions.add(new modelclass("What is the 8th letter of the alphabet?", "H", "G", "H", "I", "J"));
        quizQuestions.add(new modelclass("What is the square root of 81?", "9", "8", "9", "10", "7"));
        quizQuestions.add(new modelclass("If you rearrange the letters 'CIFAIPC' you would have the name of a(n):", "Ocean", "City", "Animal", "Country", "Ocean"));
        quizQuestions.add(new modelclass("How many bones are there in the human body?", "206", "205", "206", "207", "208"));
        quizQuestions.add(new modelclass("What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris"));
        quizQuestions.add(new modelclass("Which planet is known as the Red Planet?", "Mars", "Earth", "Jupiter", "Mars", "Venus"));
        quizQuestions.add(new modelclass("What is the chemical symbol for water?", "H2O", "O2", "CO2", "H2O", "H2"));
        quizQuestions.add(new modelclass("What is the speed of light?", "299,792,458 m/s", "300,000,000 m/s", "299,792,458 m/s", "150,000,000 m/s", "250,000,000 m/s"));
        quizQuestions.add(new modelclass("Which country is the largest by area?", "Russia", "Canada", "China", "Russia", "USA"));
        quizQuestions.add(new modelclass("Who wrote 'Hamlet'?", "Shakespeare", "Dickens", "Shakespeare", "Tolkien", "Hemingway"));
        quizQuestions.add(new modelclass("What is the currency of Japan?", "Yen", "Dollar", "Euro", "Yen", "Won"));
        quizQuestions.add(new modelclass("What is the smallest prime number?", "2", "1", "2", "3", "5"));
        quizQuestions.add(new modelclass("What is the capital of Italy?", "Rome", "Paris", "London", "Berlin", "Rome"));
        quizQuestions.add(new modelclass("Which ocean is the largest?", "Pacific", "Atlantic", "Indian", "Pacific", "Arctic"));
        quizQuestions.add(new modelclass("How many continents are there?", "7", "5", "6", "7", "8"));
        quizQuestions.add(new modelclass("What is the largest planet in our solar system?", "Jupiter", "Earth", "Mars", "Jupiter", "Saturn"));
        quizQuestions.add(new modelclass("What is the boiling point of water?", "100°C", "90°C", "100°C", "110°C", "120°C"));
        quizQuestions.add(new modelclass("Which country is known as the Land of the Rising Sun?", "Japan", "China", "Japan", "Korea", "Thailand"));
        quizQuestions.add(new modelclass("What is the longest river in the world?", "Nile", "Amazon", "Nile", "Yangtze", "Mississippi"));
        quizQuestions.add(new modelclass("Which gas is most abundant in the Earth's atmosphere?", "Nitrogen", "Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"));
        quizQuestions.add(new modelclass("What is the chemical symbol for gold?", "Au", "Ag", "Au", "Fe", "Pb"));
        quizQuestions.add(new modelclass("What is the largest mammal?", "Blue Whale", "Elephant", "Giraffe", "Blue Whale", "Shark"));
        quizQuestions.add(new modelclass("How many planets are in the solar system?", "8", "7", "8", "9", "10"));
        quizQuestions.add(new modelclass("What is the hardest natural substance on Earth?", "Diamond", "Gold", "Diamond", "Iron", "Silver"));
        quizQuestions.add(new modelclass("What is the capital of Australia?", "Canberra", "Sydney", "Melbourne", "Canberra", "Brisbane"));
        quizQuestions.add(new modelclass("Which country has the largest population?", "China", "India", "USA", "China", "Indonesia"));
        quizQuestions.add(new modelclass("Who developed the theory of relativity?", "Einstein", "Newton", "Einstein", "Galileo", "Curie"));
        quizQuestions.add(new modelclass("What is the chemical formula for table salt?", "NaCl", "H2O", "CO2", "NaCl", "KCl"));
        quizQuestions.add(new modelclass("Which element has the atomic number 1?", "Hydrogen", "Helium", "Oxygen", "Hydrogen", "Carbon"));
        quizQuestions.add(new modelclass("What is the main language spoken in Brazil?", "Portuguese", "Spanish", "Portuguese", "French", "English"));
        quizQuestions.add(new modelclass("What is the longest bone in the human body?", "Femur", "Humerus", "Tibia", "Femur", "Radius"));
        quizQuestions.add(new modelclass("What is the smallest country in the world?", "Vatican City", "Monaco", "San Marino", "Vatican City", "Liechtenstein"));
        quizQuestions.add(new modelclass("Who painted the Mona Lisa?", "Da Vinci", "Michelangelo", "Raphael", "Da Vinci", "Van Gogh"));
        quizQuestions.add(new modelclass("What is the capital of Canada?", "Ottawa", "Toronto", "Vancouver", "Ottawa", "Montreal"));
        quizQuestions.add(new modelclass("What is the most spoken language in the world?", "Mandarin", "English", "Spanish", "Mandarin", "Hindi"));
        quizQuestions.add(new modelclass("What is the tallest mountain in the world?", "Everest", "K2", "Kangchenjunga", "Everest", "Lhotse"));
        quizQuestions.add(new modelclass("What is the main ingredient in traditional Japanese miso soup?", "Soybean", "Tofu", "Soybean", "Seaweed", "Rice"));
        quizQuestions.add(new modelclass("What is the largest desert in the world?", "Sahara", "Gobi", "Arabian", "Sahara", "Kalahari"));
        quizQuestions.add(new modelclass("What is the fastest land animal?", "Cheetah", "Lion", "Tiger", "Cheetah", "Leopard"));
        quizQuestions.add(new modelclass("What is the largest organ in the human body?", "Skin", "Heart", "Liver", "Skin", "Lungs"));
        quizQuestions.add(new modelclass("What is the currency of the United Kingdom?", "Pound", "Euro", "Dollar", "Pound", "Franc"));
        quizQuestions.add(new modelclass("Which planet is closest to the sun?", "Mercury", "Venus", "Earth", "Mercury", "Mars"));
        quizQuestions.add(new modelclass("Which gas is most abundant in the Earth's atmosphere?", "Nitrogen", "Oxygen", "Carbon Dioxide", "Argon", "Nitrogen"));
        quizQuestions.add(new modelclass("What is the chemical symbol for gold?", "Au", "Ag", "Au", "Fe", "Pb"));
        quizQuestions.add(new modelclass("What is the largest mammal?", "Blue Whale", "Elephant", "Giraffe", "Blue Whale", "Shark"));
        quizQuestions.add(new modelclass("How many planets are in the solar system?", "8", "7", "8", "9", "10"));
        quizQuestions.add(new modelclass("What is the hardest natural substance on Earth?", "Diamond", "Gold", "Diamond", "Iron", "Silver"));
        quizQuestions.add(new modelclass("What is the capital of Australia?", "Canberra", "Sydney", "Melbourne", "Canberra", "Brisbane"));
        quizQuestions.add(new modelclass("Which country has the largest population?", "China", "India", "USA", "China", "Indonesia"));
        quizQuestions.add(new modelclass("Who developed the theory of relativity?", "Einstein", "Newton", "Einstein", "Galileo", "Curie"));
        quizQuestions.add(new modelclass("What is the chemical formula for table salt?", "NaCl", "H2O", "CO2", "NaCl", "KCl"));
        quizQuestions.add(new modelclass("Which element has the atomic number 1?", "Hydrogen", "Helium", "Oxygen", "Hydrogen", "Carbon"));
        quizQuestions.add(new modelclass("What is the main language spoken in Brazil?", "Portuguese", "Spanish", "Portuguese", "French", "English"));
        quizQuestions.add(new modelclass("What is the longest bone in the human body?", "Femur", "Humerus", "Tibia", "Femur", "Radius"));
        quizQuestions.add(new modelclass("What is the smallest country in the world?", "Vatican City", "Monaco", "San Marino", "Vatican City", "Liechtenstein"));
        quizQuestions.add(new modelclass("Who painted the Mona Lisa?", "Da Vinci", "Michelangelo", "Raphael", "Da Vinci", "Van Gogh"));
        quizQuestions.add(new modelclass("What is the capital of Canada?", "Ottawa", "Toronto", "Vancouver", "Ottawa", "Montreal"));
        quizQuestions.add(new modelclass("What is the most spoken language in the world?", "Mandarin", "English", "Spanish", "Mandarin", "Hindi"));
        quizQuestions.add(new modelclass("What is the tallest mountain in the world?", "Everest", "K2", "Kangchenjunga", "Everest", "Lhotse"));
        quizQuestions.add(new modelclass("What is the main ingredient in traditional Japanese miso soup?", "Soybean", "Tofu", "Soybean", "Seaweed", "Rice"));
        quizQuestions.add(new modelclass("What is the largest desert in the world?", "Sahara", "Gobi", "Arabian", "Sahara", "Kalahari"));
        quizQuestions.add(new modelclass("What is the fastest land animal?", "Cheetah", "Lion", "Tiger", "Cheetah", "Leopard"));
        quizQuestions.add(new modelclass("What is the largest organ in the human body?", "Skin", "Heart", "Liver", "Skin", "Lungs"));
        quizQuestions.add(new modelclass("What is the currency of the United Kingdom?", "Pound", "Euro", "Dollar", "Pound", "Franc"));
        quizQuestions.add(new modelclass("Which planet is closest to the sun?", "Mercury", "Venus", "Earth", "Mercury", "Mars"));
        quizQuestions.add(new modelclass("What is the smallest bone in the human body?", "Stapes", "Malleus", "Incus", "Stapes", "Femur"));
        quizQuestions.add(new modelclass("How many colors are there in a rainbow?", "7", "6", "7", "8", "9"));
        quizQuestions.add(new modelclass("Who is known as the father of modern physics?", "Einstein", "Newton", "Galileo", "Einstein", "Hawking"));
        quizQuestions.add(new modelclass("What is the chemical formula for glucose?", "C6H12O6", "C12H22O11", "C6H12O6", "CH4", "C2H5OH"));
        quizQuestions.add(new modelclass("Which planet is known for its rings?", "Saturn", "Jupiter", "Mars", "Saturn", "Uranus"));
        quizQuestions.add(new modelclass("What is the most common element in the universe?", "Hydrogen", "Helium", "Oxygen", "Hydrogen", "Carbon"));
        quizQuestions.add(new modelclass("Which ocean is the smallest?", "Arctic", "Atlantic", "Indian", "Arctic", "Pacific"));
        quizQuestions.add(new modelclass("What is the basic unit of life?", "Cell", "Atom", "Molecule", "Cell", "Tissue"));
        quizQuestions.add(new modelclass("What is the largest planet in the solar system?", "Jupiter", "Saturn", "Earth", "Jupiter", "Mars"));
        quizQuestions.add(new modelclass("Which element is used in pencils?", "Graphite", "Lead", "Iron", "Graphite", "Silver"));
        quizQuestions.add(new modelclass("What is the primary gas in the Earth's atmosphere?", "Nitrogen", "Oxygen", "Carbon Dioxide", "Nitrogen", "Argon"));
        quizQuestions.add(new modelclass("What is the center of the solar system?", "Sun", "Earth", "Mars", "Sun", "Jupiter"));
        quizQuestions.add(new modelclass("Which organ is responsible for pumping blood?", "Heart", "Lung", "Kidney", "Heart", "Liver"));
        quizQuestions.add(new modelclass("How many chambers are there in the human heart?", "4", "2", "4", "3", "5"));
        quizQuestions.add(new modelclass("What is the largest internal organ in the human body?", "Liver", "Lung", "Heart", "Liver", "Kidney"));
        quizQuestions.add(new modelclass("Which continent is known as the 'Dark Continent'?", "Africa", "Asia", "Europe", "Africa", "Australia"));
        quizQuestions.add(new modelclass("Which is the hardest natural material found on Earth?", "Diamond", "Gold", "Iron", "Diamond", "Steel"));
        quizQuestions.add(new modelclass("Which planet is known as the 'Red Planet'?", "Mars", "Jupiter", "Saturn", "Mars", "Venus"));
        quizQuestions.add(new modelclass("What is the largest land animal?", "Elephant", "Giraffe", "Hippopotamus", "Elephant", "Rhino"));
        quizQuestions.add(new modelclass("What is the largest mammal in the ocean?", "Blue Whale", "Shark", "Dolphin", "Blue Whale", "Orca"));
        quizQuestions.add(new modelclass("What is the most common blood type in humans?", "O+", "A+", "B+", "O+", "AB+"));
        quizQuestions.add(new modelclass("What is the chemical symbol for iron?", "Fe", "Ir", "I", "Fe", "In"));
        quizQuestions.add(new modelclass("What is the name of the process by which plants make their food?", "Photosynthesis", "Respiration", "Digestion", "Photosynthesis", "Fermentation"));
        quizQuestions.add(new modelclass("What is the capital of Spain?", "Madrid", "Barcelona", "Seville", "Madrid", "Valencia"));
        quizQuestions.add(new modelclass("What is the longest river in Asia?", "Yangtze", "Ganges", "Mekong", "Yangtze", "Yellow"));
        quizQuestions.add(new modelclass("Which planet is known as the 'Evening Star'?", "Venus", "Mars", "Jupiter", "Venus", "Saturn"));
        quizQuestions.add(new modelclass("What is the smallest planet in our solar system?", "Mercury", "Mars", "Venus", "Mercury", "Pluto"));
        quizQuestions.add(new modelclass("What is the term for an animal that only eats plants?", "Herbivore", "Carnivore", "Omnivore", "Herbivore", "Insectivore"));
        quizQuestions.add(new modelclass("Which part of the plant absorbs water?", "Root", "Stem", "Leaf", "Root", "Flower"));
        quizQuestions.add(new modelclass("What is the primary function of the white blood cells?", "Fight infection", "Carry oxygen", "Clot blood", "Fight infection", "Digest food"));
        quizQuestions.add(new modelclass("What is the largest species of shark?", "Whale Shark", "Great White Shark", "Hammerhead Shark", "Whale Shark", "Tiger Shark"));
        quizQuestions.add(new modelclass("What is the longest running TV show in the United States?", "The Simpsons", "Friends", "The Tonight Show", "The Simpsons", "The Office"));
        quizQuestions.add(new modelclass("What is the boiling point of water in Fahrenheit?", "212°F", "100°F", "212°F", "180°F", "250°F"));
        quizQuestions.add(new modelclass("What is the study of living organisms called?", "Biology", "Physics", "Chemistry", "Biology", "Geology"));


        ////completion of quizQuestions ///





                new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intenticonpage=new Intent(MainActivity.this, quiz_page.class);
                startActivity(intenticonpage);
            }
        },2000);

    }


}