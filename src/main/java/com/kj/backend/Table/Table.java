package com.kj.backend.Table;


import com.kj.backend.Row.Row;
import com.kj.backend.Text.Text;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@javax.persistence.Table
public class Table {
    @Id
    private String id;
    @OneToOne(cascade= CascadeType.ALL)
    @MapsId
    @JoinColumn(name="title_id", referencedColumnName="id")
    private Text title;
    private Float x;
    private Float y;
    private Float scale;
    private Float rotation;

    @OneToMany(mappedBy="row", fetch = FetchType.EAGER)
    private Set<Row> rows;



}
