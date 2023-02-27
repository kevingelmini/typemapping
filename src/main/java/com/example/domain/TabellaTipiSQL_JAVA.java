package com.example.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tabella_tipi_sql_java")
@Getter @Setter @ToString
public class TabellaTipiSQL_JAVA {
    //La naiming convention di java è automaticamente convertita nella naiming convention _
    @Id//Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrement
    //bigint
    Long        tipoLong_id;

    boolean     tipoBoolean;
    byte[]      tipoVettoreByte;
    int         tipoIntero;
    float       tipoFloat;
    double      tipoDouble;
    //decimal(18,4)
    //@Column(name="nome_del_campo")
    @Column(precision=18, scale=4)
    BigDecimal  tipoBigDecimal;

    Date        tipoData; // con informazioni di time zone
    //datetime --> 6byte
    //Data di creazione tupla 01/01/1970
    @CreationTimestamp
    Timestamp   tipoDateTimestamp_creation;
    //Data di aggiornamento tupla 01/01/1970
    @UpdateTimestamp
    Timestamp   tipoDateTimestamp_update;

    Time        tipoTime;
    LocalDate   tipoLocalDate; // senza informazioni di time zone
    LocalTime   tipoLocalTime;
    LocalDateTime tipoLocalDateTime;
    //
    @Column(columnDefinition="YEAR")
    Short       tipoYear; 
    
    char        tipoChar;
    //varchar(20)
    @Column(length=20)
    String      tipoVarchar;
    //text 65000 caratteri
    @Column(columnDefinition="TEXT")
    String      tipoText;
    //Large Object Binary --> Salvataggio binario
    @Lob
    String      tipoLongText;
    //Large Object Binary --> Array di byte per immagine
    @Lob
    byte[]      tipoLongBlob;

}
