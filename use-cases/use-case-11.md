# USE CASE: 4 Produce a Report on all the cities in a district.

## CHARACTERISTIC INFORMATION

### Goal in Context

As the organisation i want to be able to sort all the cities in a district by largest population to smallest so that i can sort city data.

### Scope

Organisation

### Level

Primary task.

### Preconditions

The cities respective fields and `district` fields are already present in the database

### Success End Condition

A report is available for the organization.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation.

### Trigger

A request for all the cities in a district sorted by largest population to smallest.

## MAIN SUCCESS SCENARIO

1. Need of retrieving all the cities in a given district sorted by largest population to smallest.
2. The user queries the database selecting the above option and the district.
3. A report from the database is given back to the organization.

## EXTENSIONS

2. **Database missing specific data**:
    1. Organisation troubleshoots with IT to ensure the database is actually missing the data. 
    
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 3.0