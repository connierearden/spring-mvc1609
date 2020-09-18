package web.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "series")
    private int series;
    @Column(name = "status")
    private String status;

    public Car() {}

    public Car(String name, int series, String status) {
        this.name = name;
        this.series = series;
        this.status = status;
    }

    public Car(String name, int series) {
        this.name = name;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", series=" + series +
                ", status=" + status +
                '}';
    }
}