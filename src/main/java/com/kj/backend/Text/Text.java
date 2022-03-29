package com.kj.backend.Text;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Text {
    @Id
    private String id;
    private String field;
    private String fontFamily;
    private String fontSize;
    private String fontWeight;
    private String fontStyle;
    private String textDecorationLine;
    private String textAlign;
    private String color;
}
