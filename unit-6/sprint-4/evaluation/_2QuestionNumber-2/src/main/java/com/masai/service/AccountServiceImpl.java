package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AccountException;
import com.masai.exception.InsufficientFundException;
import com.masai.model.Account;
import com.masai.model.AccountDTO;
import com.masai.repository.AccountDao;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao adao;

	@Override
	public Account openAccount(Account acc) throws AccountException {

		Account ac=adao.save(acc);
		
		return ac;
	}

	@Override
	public Account closeAccount(Integer accno) throws AccountException {
		Account ac = adao.findById(accno)
				.orElseThrow(()-> new AccountException("Accound not found ... "));
		
		adao.delete(ac);
		return ac;
	}
	
	
	
	@Override
	public Account depositAmount(Integer accno, Integer amount) throws AccountException {
		
		Account ac= adao.findById(accno)
				.orElseThrow(()-> new AccountException("Account not founnd ..."));
		
		ac.setBalance(ac.getBalance()+amount);
		
		return adao.save(ac);
		
	}

	@Override
	public Account withdrawAmount(int accno, Integer amount) throws AccountException, InsufficientFundException {
		
		
		Account ac= adao.findById(accno)
				.orElseThrow(()-> new AccountException("Account not founnd ..."));
		
		if(ac.getBalance() <amount) {
			
			throw new InsufficientFundException("insufficient balance");
			
		}else {
			
			int balance = ac.getBalance() - amount;
			
			ac.setBalance(balance);
			return adao.save(ac);
		}
	}

	@Override
	public String transferAmount(AccountDTO dto) throws AccountException, InsufficientFundException {
		
		Account with = withdrawAmount(dto.getSrcAccno(),dto.getAmount());
		
		if(with.getBalance() < 0) {
			throw new InsufficientFundException("insufficient balance");
		}
		
		Account dep = depositAmount(dto.getDesAccno(),dto.getAmount());;
		
		
		
		
		return "transfer successfull";
		
		
		
		
	}
	
	
	

}
