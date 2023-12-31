package wtf.jacquant.capgemini.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wtf.jacquant.capgemini.domains.DepositTransaction;
import wtf.jacquant.capgemini.domains.Transaction;
import wtf.jacquant.capgemini.repositories.transaction.DepositTransactionRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionService {


    private final DepositTransactionRepository depositTransactionRepository;

    Transaction createDeposit(final BigDecimal amount) {
        DepositTransaction depositTransaction = new DepositTransaction();
        depositTransaction.setAmount(amount);
        return depositTransactionRepository.save(depositTransaction);
    }
}
