package com.ryszard.domain.spring;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_surname")
    private String userSurname;

    @Column(name="login")
    @NotEmpty
    @Size(min=4)
    private String login;

    @Column(name="password")
    @NotEmpty
    @Size(min=4)
    private String password;

    @Column(nullable=false, unique=true)
    @NotEmpty
    @Email(message="{errors.invalid_email}")
    private String userEmail;

    @ManyToMany
    private Set<Role> roles;

    @Transient
    private String passwordConfirm;


    public User() {
    }

    public User(String userName, String userSurname, @NotEmpty @Size(min = 4) String login, @NotEmpty @Size(min = 4) String password, @NotEmpty @Email(message = "{errors.invalid_email}") String userEmail, Set<Role> roles, String passwordConfirm) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.login = login;
        this.password = password;
        this.userEmail = userEmail;
        this.roles = roles;
        this.passwordConfirm = passwordConfirm;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(userSurname, user.userSurname) &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(userEmail, user.userEmail) &&
                Objects.equals(roles, user.roles) &&
                Objects.equals(passwordConfirm, user.passwordConfirm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSurname, login, password, userEmail, roles, passwordConfirm);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userSurname='").append(userSurname).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", userEmail='").append(userEmail).append('\'');
        sb.append(", roles=").append(roles);
        sb.append(", passwordConfirm='").append(passwordConfirm).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
