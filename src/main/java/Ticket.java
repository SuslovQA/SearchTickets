public class Ticket implements Comparable<Ticket>{
    private int id;
    private int price;
    private String departureAirport;
    private String arrivalAirport;
    private int flightTime;

    public Ticket(int id, int price, String departureAirport, String arrivalAirport, int flightTime) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightTime = flightTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return 1;
        } else if (this.price > o.price) {
            return -1;
        } else {
            return 0;
        }
    }

    //    Класс информации о билете — это data-класс, который должен содержать:
//
//ID.
//Стоимость, для упрощения будем считать стоимость единой для всех продавцов.
//Аэропорт вылета, вы можете использовать IATA-коды.
//Аэропорт прилёта, вы можете использовать IATA-коды.
//Время в пути в минутах.
//Других данных не нужно.
//
//Этот класс должен реализовывать интерфейс Comparable<...> так,
// чтобы по умолчанию сортировка происходила по цене, самый дешёвый — самый первый.
// Для этого шапка вашего дата-класса должна выглядеть как-то так:
//
//public class Ticket implements Comparable<Ticket> {
//После чего идея подсветит вам её красным, нажмите на подсказку и выберите «Implement methods» —
// «Реализовать методы». Идея сама сгенерирует заглушку для нужного метода из этого интерфейса,
// которая всегда возвращает 0. Вам надо переписать тело сгенерированного метода, чтобы если билет,
// у которого вызвали метод compareTo, стоит дешевле, чем тот, который передали через параметр,
// то возвращалось бы число меньше нуля. Если же билет, наоборот, дороже, то число больше нуля,
// а если стоимость одинакова, то 0. Дав верную реализацию этому методу,
// вы научите Java сравнивать объекты этого класса.
//
//Репозиторий
//Репозиторий для хранения билетов ничем не отличается от тех репозиториев, что мы проходили раньше.
//
//Менеджер
//В менеджере методов findAll должен претерпеть некоторые изменения — он должен принимать два параметра:
//
//from — аэропорта вылета,
//to — аэропорт прилёта.
//Значит, в результате поиска возвращается массив только с теми билетами,
// что соответствуют условиям поиска. Методы поиска вы уже делать умеете.
//
//Кроме того, результаты должны быть отсортированы по цене от меньшей к большей.
}
