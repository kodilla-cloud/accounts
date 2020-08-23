package com.kodilla.accounts.service;

import com.kodilla.accounts.dto.AccountDto;
import com.kodilla.accounts.entity.Account;
import com.kodilla.accounts.mapper.AccountMapper;
import com.kodilla.accounts.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper mapper;

    public List<AccountDto> getAccountsForCustomer(Long customerId) {
        List<Account> accounts = accountRepository.findAllByCustomerId(customerId);
        return mapper.mapToAccountsDto(accounts);
    }
}
