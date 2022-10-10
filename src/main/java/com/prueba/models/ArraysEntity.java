package com.prueba.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "arrays")
public class ArraysEntity {
    private Integer id;
    private String inputArray;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "input_array", nullable = false, length = 20)
    public String getInputArray() {
        return inputArray;
    }

    public void setInputArray(String inputArray) {
        this.inputArray = inputArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArraysEntity that = (ArraysEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(inputArray, that.inputArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, inputArray);
    }
}
