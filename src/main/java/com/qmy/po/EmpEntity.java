package com.qmy.po;

import javax.persistence.*;

@Entity
@Table(name = "emp", schema = "emp", catalog = "")
public class EmpEntity {
    private int id;
    private String name;
    private String pwd;
    private Double money;

    @Override
    public String toString() {
        return "EmpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", money=" + money +
                '}';
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}

        EmpEntity empEntity = (EmpEntity) o;

        if (id != empEntity.id) {return false;}
        if (name != null ? !name.equals(empEntity.name) : empEntity.name != null) {return false;}
        if (pwd != null ? !pwd.equals(empEntity.pwd) : empEntity.pwd != null) {return false;}
        if (money != null ? !money.equals(empEntity.money) : empEntity.money != null) {return false;}

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        return result;
    }
}
