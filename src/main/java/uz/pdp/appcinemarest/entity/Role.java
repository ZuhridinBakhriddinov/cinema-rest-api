package uz.pdp.appcinemarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.appcinemarest.entity.enums.Role_enum;
import uz.pdp.appcinemarest.entity.template.AbsEntity;

import javax.persistence.*;

// Zuhridin Bakhriddinov 3/14/2022 3:48 PM
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Role  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role_enum name;


}
