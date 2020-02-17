# USE CASE: 4 Produce a Report on the top n populated cities in a given district.

## CHARACTERISTIC INFORMATION

### Goal in Context

As the organisation i want to be able to sort all the capital cities in a continent by largest population to smallest so that i can compare capital population.

### Scope

Organisation

### Level

Primary task.

### Preconditions

The cities, district and respective fields are already present in the database

### Success End Condition

A report is available for the organization.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation.

### Trigger

A request for the top n populated cities in a given country.

## MAIN SUCCESS SCENARIO

1. Need of retrieving the top n populated cities in a given district.
2. The user queries the database selecting the above option and giving n and a district as an input. 
3. A report from the database is given back to the organization.

## EXTENSIONS

2. **Database missing specific data**:
    1. Organisation troubleshoots with IT to ensure the database is actually missing the data. 
    
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 3.0