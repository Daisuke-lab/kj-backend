package com.kj.backend.Connection;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Connection {

    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name="source_id", nullable = true)
    private Table source;
    @ManyToOne
    @JoinColumn(name="destination_id", nullable = true)
    private Table destination;
    private Float destinationX;
    private Float destinationY;


}
