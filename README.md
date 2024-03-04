# Image-Processing-Java-3rd-year - Converting Color Image to Gray-Scale Image – Weighted method (luminosity method)
## Cerinte
* Imaginea sursa este BMP (fisier) – 24bit BMP – RGB
* Pentru procesare se folosesc doar algoritmi si/ sau secvente de cod low-level (nu se accepta utilizare de metode de procesare altele decat cele scrise in tema)
* Include in totalitate conceptele POO – incapsulare, mostenire, polimorphism, abstractizare
* Codul sursa respecta absolut toate “Coding standards”. Codul sursa este comentat
* Operatii de lucru cu fisiere
* Operatii de intrare de la tastatura si prin parametri liniei de comanda pentru asignareafisierelor de intrare, parametri / setarile / optiunile de executie si pentru asignareafisierelor de iesire
* Aplicatia trebuie sa fie multimodulara (impartirea in clase cu ierarhii – chiar cu cost intimp de procesare). Cel putin 3 niveluri de mostenire
* Include varargs
* Include constructori
* Include cel putin un bloc de initializare si un bloc static de initializare
* Include Interface (cu o clasa care o implementeaza)
* Include Clase Abstracte cu metode abstracte si clase concrete care extind clasele abstracte
* Include tratarea exceptiilor
* Aplicatia contine 2 pachete: Pachetul 1 sa contina aplicatia de test, pachetul 2 sa contina restul claselor
* Aplicatia contine Producer-Consumer cu urmatoarele cerinte:
    * un nou thread este alocat citirii din fisier a imaginii sursa – Producer Thread. Intra in Not Runnable dupa citirea a unui segment de informatie
    * un nou thread (Consumer Thread) este alocat consumului informatiei furnizate de Producer Thread. Se utilizeaza “multithread communication” (notify).
    * Se insereaza output la consola si sleep (1000) pentru a evidentia etapele comunicarii.
    * Se folosesc elementele de sincronizare pentru protectia la o eventuala interferenta cu alte posibile threaduri
    * Dupa terminarea consumului intregii informatii de imagine sursa, se incepe procesarea
## Etapele de executie ale aplicatiei sunt:
* citire informatii de identificare fisier sursa (fisiere sursa) si citire informatii de identificare fisier destinatie
* citire fisier sursa
* procesare imagine
* scriere fisier destinatie
* inregistrare timp de executie fiecare etapa
* afisare rezultate timp de procesare fiecare etapa
