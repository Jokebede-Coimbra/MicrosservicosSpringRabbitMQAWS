package com.coimbra.propostaapp.mapper;

import com.coimbra.propostaapp.dto.PropostaRequestDto;
import com.coimbra.propostaapp.entity.Proposta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper
public interface PropostaMapper {

    @Mapping(target = "usuario.nome", source = "nome")
    @Mapping(target = "usuario.sobrenome", source = "sobrenome")
    @Mapping(target = "usuario.cpf", source = "cpf")
    @Mapping(target = "usuario.telefone", source = "telefone")
    @Mapping(target = "usuario.renda", source = "renda")
    Proposta convertDtoProposta(PropostaRequestDto propostaRequestDto);

}
