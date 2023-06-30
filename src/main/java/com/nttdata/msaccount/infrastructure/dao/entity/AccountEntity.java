package com.nttdata.msaccount.infrastructure.dao.entity;

import com.nttdata.msaccount.domain.model.Person;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts")
public class AccountEntity {

  @Id
  private String id;
  private String accountNumber;
  private ObjectId clientId;
  private String passiveProductId;

  private String activeProductId;
  private List<Person> authorizedSigners;

  private LocalDateTime date;

}
