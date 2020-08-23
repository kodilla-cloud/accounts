package com.kodilla.accounts.mapper;

import com.kodilla.accounts.dto.AccountDto;
import com.kodilla.accounts.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountMapper {

    public List<AccountDto> mapToAccountsDto(List<Account> accounts) {
        return accounts.stream().map(account -> AccountDto.builder()
            .id(account.getId())
            .nrb(account.getNrb())
            .currency(account.getCurrency())
            .availableFunds(account.getAvailableFunds())
        .build()).collect(Collectors.toList());
    }
}
