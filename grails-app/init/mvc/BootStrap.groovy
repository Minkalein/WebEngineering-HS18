package mvc

class BootStrap {

    def init = { servletContext ->
        Room windowRoom = save(new Room(name: "1.333", max: 32))
        Room cornerRoom = save(new Room(name: "1.331", max: 42))

        Person person = save(new Person(firstName: 'John', lastName: 'Smith', email: 'john@smith.com'))

        Date today = new Date().clearTime();
        save(new Booking(booker: person, room: windowRoom, date: today -1, slot: Booking.AM))
        save(new Booking(booker: person, room: cornerRoom, date: today +1, slot: Booking.AM))
        save(new Booking(booker: person, room: windowRoom, date: today, slot: Booking.AM))

    }
    def destroy = {
    }

    static save(domainObject){
        domainObject.save(failOnError: true)
    }
}
