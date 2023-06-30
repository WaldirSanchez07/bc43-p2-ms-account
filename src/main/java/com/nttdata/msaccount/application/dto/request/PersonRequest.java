package com.nttdata.msaccount.application.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {

  @NotEmpty(message = "El campo dni es requerido")
  @Pattern(regexp = "\\d+", message = "El campo dni debe ser numérico")
  @Size(min = 8, max = 8, message = "El campo dni debe tener 8 caracteres")
  private String dni;

  @NotBlank(message = "El campo nombre es requerido")
  @Pattern(regexp = "^[a-zA-ZñÑ]+$", message = "El campo nombre debe contener solo letras")
  private String firstName;

  @Nullable
  @Pattern(regexp = "^[a-zA-ZñÑ ]*$", message = "El campo otros nombres debe contener solo letras")
  private String otherNames;

  @NotBlank(message = "El campo apellido paterno es requerido")
  @Pattern(regexp = "^[a-zA-ZñÑ]+$", message = "El campo apellido paterno debe contener solo letras")
  private String firstSurname;

  @NotBlank(message = "El campo apellido materno es requerido")
  @Pattern(regexp = "^[a-zA-ZñÑ]+$", message = "El campo apellido materno debe contener solo letras")
  private String secondSurname;


}
