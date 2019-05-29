# Java Training
#### madmajk repository 

find my code at [github.com][1]


#
    Lekcja 2 - 13 marca 2019

**Poruszone tematy i pojęcia**  
* `Klasa` - deklaracja, modyfikatory, statyczny blok kodu, dobra praktyka, żeby klasa miała max 8 metod i 6 pól
* Kiedy metoda nie ma parametrów to może korzystać ze zmiennych klasy
* Czym jest SRP czyli single responsibility principle
* Słowo kluczowe `this`
* Parametry metod - nie może być więcej niż 4 (chodzi o unit testy)

**Przeciążanie (overloading) metod**  
* Czyli metoda w takiej samej metodzie
* Sygnatura musi być rożna, żeby było można robić overload.
* Zakresy dostępu zasięg zmiennej, lepiej deklarować zmienna w ostatniej chwili
**Konstruktory**
* Pamiętać, żeby przy każdym obiekcie stworzyć konstruktor
* Konstruktor, który coś robi (np. w zależności od argumentów) w przykładzie na zajęciach jeden wywołuje drugi a drugi trzeci
* getters i setters  a potem wywoływanie konstruktorów getterow i setterow z menu RPM generate..
* Dokładniejszy opis modyfikatorów: `public`, `private`, `static`
* Pokazanie możliwości zmiany metody main w menu intellij → edit configurations
* Budowanie artefaktów jar i potem odpalanie tego z cmd za pomocą komendy  java -jar nazwapliku.jar

**Dziedziczenie**
* Tworzenie runnerow czyli wywołujemy main ktore jest statyczne tworząc metodę dynamiczna i uruchamiając ja
* Rzutowanie typów referencyjnych - ogólna informacja i prosty przykład ze się da
* Annotation adnotacja, na przykładzie `@Override` `@Test`

#
  
  ```  //bez formatowania
  @Test
  public void testReadingFilesUsingReaderObject() throws IOException {
      try (FileReader os = new FileReader("C:\\Users\\m.dmochowski\\Documents\\x.txt")) {
          int data = 0;
          while (data != -1) {
              data = os.read();
              System.out.println((char)data);
              }
          }
      }
```

`@Test` for **testReadingFilesUsingReaderObject()**

(www.google.pl)

[1]: http://github.com/  "GIT"

