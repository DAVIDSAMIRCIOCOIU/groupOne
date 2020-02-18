# USE CASE: 4 Produce a Report on all the countries in a continent by largest population to smallest.

## CHARACTERISTIC INFORMATION

### Goal in Context

As the organisation i want to be able to organise all the countries in a continent by largest population to smallest so that i can efficiently look at data.

### Scope

Organisation

### Level

Primary task.

### Preconditions

The countries and continents are already present in the database.

### Success End Condition

A report is available for the organization.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation.

### Trigger

A request for all countries in a continent sorted by largest population to smallest.

## MAIN SUCCESS SCENARIO

1. Need of retrieving countries data in a given continent sorted by largest population to smallest.
2. Organization queries the database selecting the above option from the terminal and inserting the continent.
3. A report from the database is given back to the organization.

## EXTENSIONS

2. **Database missing specific data**:
    1. Organisation troubleshoots with IT to ensure the database is actually missing the data. 
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 3.0