package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements BaseEntity<Long>{

    private static final long serialVersionUID = 5093217570389294027L;

    @SerializedName("id")
    private Long id;

    @SerializedName("username")
    private String userName;

    @SerializedName("firstName")
    private String firstName;

    @SerializedName("lastName")
    private String lastName;

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    @SerializedName("phone")
    private String phone;

    @SerializedName("userStatus")
    private Integer userStatus;
}
