package com.fullstackapp.Trail.Model;


import javax.persistence.*;

@Entity
@Table(name = "allInfo")
public class User {

    //@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;


    @Column(name = "Name")
    private String Name;

    @Id
    @Column(name = "Email",unique = true)
    private String Email;

    @Column(name = "M_number")
    private String Mobile_no;

    public User() {
    }

    public User(Integer id,String name, String email, String mobile_no) {
        this.id=id;
        Name = name;
        Email = email;
        Mobile_no = mobile_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile_no() {
        return Mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        Mobile_no = mobile_no;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Mobile_no='" + Mobile_no + '\'' +
                '}';
    }
}
