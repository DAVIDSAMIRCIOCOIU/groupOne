# USE CASE: 4 Produce a Report on the top n populated countries in a given region (where n is provided by the user).

## CHARACTERISTIC INFORMATION

### Goal in Context

As the user i want to be able to make a report of the top N populated countries in a region, where N is provided by me, so that the i can compare the most populated countries.

### Scope

Organisation

### Level

Primary task.

### Preconditions

The countries and regions are already present in the database, along with respective fields.

### Success End Condition

A report is available for the organization.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation.

### Trigger

A request for n countries in a given region sorted by largest population to smallest.

## MAIN SUCCESS SCENARIO

1. Need of retrieving countries data in the a given region sorted by largest population to smallest.
2. The user queries the database providing a number n and a region, where n is the number of countries to be displayed. 
3. A report from the database is given back to the organization.

## EXTENSIONS

2. **Database missing specific data**:
    1. Organisation troubleshoots with IT to ensure the database is actually missing the data. 
    
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 3.0