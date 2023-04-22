
# Movie Rental System 

A movie rental system is a software application that helps customers rent and manage movies from a movie rental store or an online streaming platform. Here's an example of how the classes and functions of a movie rental system could be designed using object-oriented programming principles:


# Classes

## Movie
This class represents a movie in the rental system. It contains attributes such as title, genre, director, cast, release date, and a unique ID. The following methods are implemented:

- Movie(title, genre, director, cast, releaseDate, id): - constructor method
- getId(): int: returns the ID of the movie
- getTitle(): String: returns the title of the movie
- getGenre(): String: returns the genre of the movie
- getDirector(): String: returns the name of the movie's director
- getCast(): String: returns the names of the movie's cast members
- getReleaseDate(): Date: returns the release date of the movie
- isAvailable(): boolean: returns true if the movie is available for rent, false otherwise
- setAvailable(status: boolean): void: sets the availability status of the movie to the provided value

## Customer
This class represents a customer in the rental system. It contains attributes such as name, email, phone number, address, and a unique ID. The following methods are implemented:

- Customer(name, email, phone, address, id): constructor method
- getId(): int: returns the ID of the customer
- getName(): String: returns the name of the customer
- getEmail(): String: returns the email address of the customer
- getPhone(): String: returns the phone number of the customer
- getAddress(): String: returns the address of the customer
- getRentals(): List<Rental>: returns a list of all rentals made by the customer
## Rental
This class represents a rental in the system. It contains attributes such as the rented movie, the customer who rented it, rental date, and return date. The following methods are implemented:

- Rental(movie, customer, id): constructor method
- getId(): int: returns the ID of the rental
- getMovie(): Movie: returns the rented movie
- getCustomer(): Customer: returns the customer who rented the movie
- getRentalDate(): Date: returns the rental date of the movie
- getReturnDate(): Date: returns the return date of the movie
- setReturnDate(date: Date): void: sets the return date of the movie to the provided value
- calculateLateFee(): double: calculates the late fee for the rental
## RentalStore
This class represents the rental store in the system. It contains a list of movies available for rent and a list of customers registered with the store. The following methods are implemented:

- register(customer: Customer): void: registers a new customer with the store
- addMovie(movie: Movie): void: adds a new movie to the list of available movies
- removeMovie(movie: Movie): void: removes a movie from the list of available movies
- getAvailableMovies(): List<Movie>: returns a list of all available movies for rent
- rentMovie(movie: Movie, customer: Customer): void: allows a customer to rent a movie
- returnMovie(rental: Rental): void: allows a customer to return a rented movie
- getCustomerById(id: int): Customer: returns the customer with the provided ID
- getMovieById(id: int): Movie: returns the movie with the provided ID

#UML Dialgram
![UML Diagram](/Blank diagram.png)

