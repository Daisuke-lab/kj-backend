package com.kj.backend.Row;


import com.kj.backend.Text.Text;
import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Row {
    @Id
    private String id;
    @OneToOne(cascade= CascadeType.ALL)
    @MapsId
    @JoinColumn(name="key_id", referencedColumnName="id")
    private Text key;

    @OneToOne(cascade= CascadeType.ALL)
    @MapsId
    @JoinColumn(name="value_id", referencedColumnName="id")
    private Text value;

    @ManyToOne
    @JoinColumn(name="table_id", nullable = true)
    private Table table;

}
