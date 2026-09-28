# Personal Bank Ledger & Monthly Statement Generator

A structured framework for managing personal bank transactions, maintaining a real-time ledger, and generating standardized monthly bank statements.

---

## 1. Account Details & Metadata

| Field | Value / Details |
| :--- | :--- |
| **Account Holder Name** | Jane Doe |
| **Account Type** | Checking / Savings |
| **Account Number** | `XXXX-XXXX-1234` |
| **Bank Name** | Apex National Bank |
| **Routing / IFSC Code** | `APEX0009876` |
| **Currency** | USD ($) |
| **Opening Date** | January 1, 2026 |

---

## 2. Personal Bank Ledger Template

Maintain this ledger continuously. Record every incoming (Credit) and outgoing (Debit) transaction to track your running balance.

### Transaction Category Codes
- **INC**: Income (Salary, Dividends, Transfers In)
- **EXP-UTIL**: Utilities & Bills (Electricity, Water, Internet)
- **EXP-LIV**: Living Expenses (Groceries, Dining, Transport)
- **EXP-ENT**: Entertainment & Leisure
- **SAV-INV**: Savings & Investments
- **TRF**: Internal/External Transfer

### Master Transaction Ledger

| Date | Transaction ID | Category | Description / Payee | Debit (-) | Credit (+) | Running Balance | Notes / Tag |
| :---: | :---: | :---: | :--- | :---: | :---: | :---: | :--- |
| **2026-09-01** | `TXN-00000` | - | *Opening Balance Carried Forward* | - | - | **$5,000.00** | Initial balance |
| **2026-09-01** | `TXN-10001` | `INC` | Payroll Direct Deposit - ACME Corp | - | $3,500.00 | $8,500.00 | Monthly Salary |
| **2026-09-02** | `TXN-10002` | `EXP-UTIL` | City Power & Light Co. | $120.50 | - | $8,379.50 | Auto-debit |
| **2026-09-03** | `TXN-10003` | `EXP-LIV` | Whole Foods Market | $145.20 | - | $8,234.30 | Groceries |
| **2026-09-05** | `TXN-10004` | `SAV-INV` | Transfer to Index Fund Portfolio | $500.00 | - | $7,734.30 | Auto-Invest |
| **2026-09-10** | `TXN-10005` | `EXP-ENT` | StreamFlix Subscription | $15.99 | - | $7,718.31 | Monthly sub |
| **2026-09-15** | `TXN-10006` | `INC` | Peer Reimbursement (John S.) | - | $45.00 | $7,763.31 | Dinner split |
| **2026-09-18** | `TXN-10007` | `EXP-LIV` | Metro Transit Pass | $80.00 | - | $7,683.31 | Monthly pass |
| **2026-09-20** | `TXN-10008` | `EXP-UTIL` | Gigabit Fiber Broadband | $70.00 | - | $7,613.31 | Internet |

---

## 3. Generated Monthly Bank Statement

*Use the formulaic guidelines below to extract monthly data from the Master Ledger and populate this formal statement layout.*

### Monthly Statement Summary
**Statement Period:** September 1, 2026 – September 30, 2026  
**Statement Date:** October 1, 2026  

| Financial Overview | Amount |
| :--- | :--- |
| **Starting Balance (as of Sep 1, 2026)** | **$5,000.00** |
| **Total Credits / Deposits (+)** | $3,545.00 |
| **Total Debits / Withdrawals (-)** | $931.69 |
| **Net Change** | +$2,613.31 |
| **Ending Balance (as of Sep 30, 2026)** | **$7,613.31** |

---

### Itemized Monthly Activity

| Date | Transaction Ref | Description | Type | Amount | Account Balance |
| :---: | :---: | :--- | :---: | :---: | :---: |
| Sep 01 | `TXN-10001` | Payroll Direct Deposit - ACME Corp | Credit | +$3,500.00 | $8,500.00 |
| Sep 02 | `TXN-10002` | City Power & Light Co. | Debit | -$120.50 | $8,379.50 |
| Sep 03 | `TXN-10003` | Whole Foods Market | Debit | -$145.20 | $8,234.30 |
| Sep 05 | `TXN-10004` | Transfer to Index Fund Portfolio | Debit | -$500.00 | $7,734.30 |
| Sep 10 | `TXN-10005` | StreamFlix Subscription | Debit | -$15.99 | $7,718.31 |
| Sep 15 | `TXN-10006` | Peer Reimbursement (John S.) | Credit | +$45.00 | $7,763.31 |
| Sep 18 | `TXN-10007` | Metro Transit Pass | Debit | -$80.00 | $7,683.31 |
| Sep 20 | `TXN-10008` | Gigabit Fiber Broadband | Debit | -$70.00 | $7,613.31 |

---

## 4. Statement Generator Logic & Equations

When automating or manually computing monthly statements from your ledger, apply the following mathematical rules:

1. **Ending Balance Calculation:**
   $$\text{Ending Balance} = \text{Starting Balance} + \sum (\text{Credits}) - \sum (\text{Debits})$$

2. **Running Balance Maintenance (Row-by-Row):**
   $$\text{Balance}_n = \text{Balance}_{n-1} + \text{Credit}_n - \text{Debit}_n$$

3. **Monthly Savings Rate:**
   $$\text{Savings Rate (\%)} = \left( \frac{\text{Net Income}}{\text{Total Income}} \right) \times 100$$
   $$\text{Where Net Income} = \sum (\text{Credits}) - \sum (\text{Debits})$$

---

## 5. Reconciliation Checklist

Use this section at the end of each month to verify accuracy against official institution statements:

- [ ] Verify Starting Balance matches previous month's Ending Balance.
- [ ] Confirm all pending cleared transactions are logged.
- [ ] Cross-check external bank statement against Master Ledger.
- [ ] Confirm total Credits match total deposit receipts.
- [ ] Confirm total Debits match total expenses/withdrawals.
- [ ] Flag and resolve any unidentified or duplicate transactions.