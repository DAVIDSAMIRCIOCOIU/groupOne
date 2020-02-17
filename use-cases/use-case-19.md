# USE CASE: 4 Produce a Report on all capital cities in a given region.

## CHARACTERISTIC INFORMATION

### Goal in Context

As the organisation i want to be able to sort all the capital cities in a region by largest population to smallest so that i can compare capital population.

### Scope

Organisation

### Level

Primary task.

### Preconditions

The capital cities, region and respective fields are already present in the database

### Success End Condition

A report is available for the organization.

### Failed End Condition

No report is produced.

### Primary Actor

Organisation.

### Trigger

A request for the capital cities in a given region sorted by largest population to smallest.

## MAIN SUCCESS SCENARIO

1. Need of retrieving the capital cities in a region sorted by largest population to smallest.
2. The user queries the database selecting the above option and giving a region as an input. 
3. A report from the database is given back to the organization.

## EXTENSIONS

2. **Database missing specific data**:
    1. Organisation troubleshoots with IT to ensure the database is actually missing the data. 
    
## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 3.0