import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.Date;
import java.util.Objects;

@Data
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@JsonPropertyOrder({ "firstName", "lastName", "dateOfBirth", "weight", "height" })
public class Account {

   // @JsonProperty("name")
    private String firstName;

    //@JsonProperty("surname")
    private String lastName;

    //@JsonIgnore
    private Date dateOfBirth;

    private int weight;

    private int height;

//    public Account() {
//    }

//    public Account(String firstName, String lastName, Date dateOfBirth, int weight, int height) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//        this.weight = weight;
//        this.height = height;
//    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public Date getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

//    @Override
//    public String toString() {
//        return "Account{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", dateOfBirth=" + dateOfBirth +
//                ", weight=" + weight +
//                ", height=" + height +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Account account = (Account) o;
//        return weight == account.weight &&
//                height == account.height &&
//                firstName.equals(account.firstName) &&
//                lastName.equals(account.lastName) &&
//                dateOfBirth.equals(account.dateOfBirth);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, dateOfBirth, weight, height);
//    }
}
